package com.example.clinicapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "visits")
data class Visit(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val patientId: Long,
    val clinicId: Long,
    val date: Long,
    val diagnosis: String,
    val treatment: String,
    val fee: Double,
    val followUpDate: Long?
)
