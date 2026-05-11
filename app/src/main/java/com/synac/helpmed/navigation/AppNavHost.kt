package com.synac.helpmed.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.synac.helpmed.ui.view.EmergencyScreen
import com.synac.helpmed.ui.view.articleScreen.ArticleDetailScreen
import com.synac.helpmed.ui.view.articleScreen.ArticleListScreen
import com.synac.helpmed.ui.view.medicineScreen.MedicineDetailScreen
import com.synac.helpmed.ui.view.medicineScreen.MedicineListScreen
import com.synac.helpmed.ui.viewModel.ArticleViewModel
import com.synac.helpmed.ui.viewModel.EmergencyViewModel
import com.synac.helpmed.ui.viewModel.MedicineViewModel

@Composable
fun AppNavHost(
    backStack: MutableList<NavKey>,
    emergencyViewModel: EmergencyViewModel,
    articleViewModel: ArticleViewModel,
    medicineViewModel: MedicineViewModel,
    modifier: Modifier = Modifier
){
    NavDisplay(
        backStack = backStack,
        modifier = modifier,
        entryProvider = entryProvider {
            entry<EmergencyDestination>{
                EmergencyScreen(
                    emergencyContactViewModel = emergencyViewModel
                )
            }
            entry<ArticleListDestination>{
                ArticleListScreen(
                    onNavigate = { backStack.add(it) },
                    articleViewModel = articleViewModel
                )
            }
            entry< ArticleDetailDestination>{
                ArticleDetailScreen(
                    onBack = { backStack.removeLastOrNull() },
                    articleViewModel = articleViewModel
                )
            }
            entry<MedicineListDestination>{
                MedicineListScreen(
                    onNavigate = { backStack.add(it) },
                    medicineViewModel = medicineViewModel
                )
            }
            entry<MedicineDetailDestination>{
                MedicineDetailScreen(
                    onBack = { backStack.removeLastOrNull() },
                    medicineViewModel = medicineViewModel
                )
            }
        }
    )
}