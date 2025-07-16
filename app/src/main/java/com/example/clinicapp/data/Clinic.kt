package com.example.clinicapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clinics")
data class Clinic(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val location: String
)
