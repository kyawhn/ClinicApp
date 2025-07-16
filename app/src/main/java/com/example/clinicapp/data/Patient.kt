package com.example.clinicapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "patients")
data class Patient(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val clinicId: Long,
    val name: String,
    val age: Int,
    val sex: String,
    val phone: String,
    val location: String,
    val complaint: String,
    val allergy: String,
    val pmhx: String
)
