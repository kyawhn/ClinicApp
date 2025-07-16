package com.example.clinicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.clinicapp.ui.theme.ClinicTheme
import com.example.clinicapp.ui.components.TabLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClinicTheme {
                TabLayout()
            }
        }
    }
}
