package com.example.clinicapp.data

import androidx.room.*

@Dao
interface VisitDao {
    @Query("SELECT * FROM visits WHERE patientId = :patientId")
    suspend fun getVisitsForPatient(patientId: Long): List<Visit>
    @Query("SELECT * FROM visits WHERE clinicId = :clinicId")
    suspend fun getVisitsForClinic(clinicId: Long): List<Visit>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(visit: Visit): Long
    @Update
    suspend fun update(visit: Visit)
}
