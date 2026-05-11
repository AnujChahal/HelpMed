package com.synac.helpmed.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import com.synac.helpmed.R

sealed class BottomNavItem(
    val destination: NavKey,
    val title: String,
    val iconRes: Int? = null,
    val imageVector: ImageVector? = null
) {
    object Emergency : BottomNavItem(
        destination = EmergencyDestination,
        title = "Emergency",
        imageVector = Icons.Default.Call
    )
    object Article : BottomNavItem(
        destination = ArticleListDestination,
        title = "Article",
        iconRes = R.drawable.book
    )
    object Medicine : BottomNavItem(
        destination = MedicineListDestination,
        title = "Medicine",
        iconRes = R.drawable.medicine
    )
}

@Composable
fun BottomNavigationBar(
    backStack: List<NavKey>,
    onNavigate: (NavKey) -> Unit
){
    val items = listOf(
        BottomNavItem.Emergency,
        BottomNavItem.Article,
        BottomNavItem.Medicine
    )
    val currentDestination = backStack.lastOrNull()
    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier
            .height(80.dp)
            .border(BorderStroke(1.dp, Color.LightGray), shape = RectangleShape)
    ) {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentDestination == item.destination,
                onClick = { onNavigate(item.destination) },
                icon = {
                    when{
                        item.imageVector != null -> Icon(
                            item.imageVector,
                            contentDescription = item.title,
                            modifier = Modifier.size(24.dp)
                        )
                        item.iconRes != null -> Icon(
                            painterResource(id = item.iconRes),
                            contentDescription = item.title,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                label = { Text(text = item.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF22c55e),
                    selectedTextColor = Color(0xFF22c55e),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}