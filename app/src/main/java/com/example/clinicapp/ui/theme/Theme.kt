package com.example.clinicapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun ClinicTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkColorScheme() else lightColorScheme(),
        content = content
    )
}
