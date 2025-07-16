package com.example.clinicapp

import android.app.Application
import androidx.room.Room
import com.example.clinicapp.data.AppDatabase

class ClinicApp : Application() {
    lateinit var database: AppDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "clinic-db"
        ).build()
    }
}
