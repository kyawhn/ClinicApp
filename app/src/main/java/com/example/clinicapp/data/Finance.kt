package com.example.clinicapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "finances")
data class Finance(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val clinicId: Long,
    val type: String,
    val amount: Double,
    val date: Long,
    val source: String
)
