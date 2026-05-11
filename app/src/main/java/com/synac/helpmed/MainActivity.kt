package com.synac.helpmed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import com.synac.helpmed.navigation.AppNavHost
import com.synac.helpmed.navigation.ArticleDetailDestination
import com.synac.helpmed.navigation.BottomNavigationBar
import com.synac.helpmed.navigation.EmergencyDestination
import com.synac.helpmed.navigation.MedicineDetailDestination
import com.synac.helpmed.ui.theme.HelpMedTheme
import com.synac.helpmed.ui.viewModel.ArticleViewModel
import com.synac.helpmed.ui.viewModel.EmergencyViewModel
import com.synac.helpmed.ui.viewModel.MedicineViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val emergencyViewModel: EmergencyViewModel by viewModels()
    private val articleViewModel: ArticleViewModel by viewModels()
    private val medicineViewModel: MedicineViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelpMedTheme {
                val backStack = remember { mutableStateListOf<NavKey>(EmergencyDestination) }
                val showBottomBar = backStack.lastOrNull().let {
                    it != ArticleDetailDestination && it != MedicineDetailDestination
                }

                Scaffold(
                    bottomBar = {
                        if(showBottomBar) {
                            BottomNavigationBar(
                                backStack = backStack,
                                onNavigate = { destination ->
                                    val existingIndex = backStack.indexOfFirst { it == destination }
                                    if(existingIndex >= 0){
                                        while(backStack.size > existingIndex + 1){
                                            backStack.removeLastOrNull()
                                        }
                                    } else {
                                        backStack.add(destination)
                                    }
                                }
                            )
                        }
                    }
                ) { innerPadding ->
                    AppNavHost(
                        backStack = backStack,
                        emergencyViewModel = emergencyViewModel,
                        articleViewModel = articleViewModel,
                        medicineViewModel = medicineViewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}