package com.example.clinicapp.data

import androidx.room.*

@Dao
interface ClinicDao {
    @Query("SELECT * FROM clinics")
    suspend fun getAll(): List<Clinic>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(clinic: Clinic): Long
    @Update
    suspend fun update(clinic: Clinic)
    @Delete
    suspend fun delete(clinic: Clinic)
}
