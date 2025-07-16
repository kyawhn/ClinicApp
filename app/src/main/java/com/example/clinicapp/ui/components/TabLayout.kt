package com.example.clinicapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import com.example.clinicapp.ui.*

@Composable
fun TabLayout() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Dashboard", "Patients", "Calendar", "Financial", "Settings")

    Scaffold(
        bottomBar = {
            NavigationBar {
                tabs.forEachIndexed { index, tab ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = { Icon(Icons.Default.Home, contentDescription = tab) },
                        label = { Text(tab) }
                    )
                }
            }
        }
    ) { innerPadding ->
        when (selectedTab) {
            0 -> DashboardScreen()
            1 -> PatientsScreen()
            2 -> CalendarScreen()
            3 -> FinancialScreen()
            4 -> SettingsScreen()
        }
    }
}
