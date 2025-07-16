package com.example.clinicapp.data

import androidx.room.*

@Dao
interface PatientDao {
    @Query("SELECT * FROM patients WHERE clinicId = :clinicId")
    suspend fun getPatientsByClinic(clinicId: Long): List<Patient>
    @Query("SELECT * FROM patients WHERE name LIKE :name")
    suspend fun searchByName(name: String): List<Patient>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(patient: Patient): Long
    @Update
    suspend fun update(patient: Patient)
    @Delete
    suspend fun delete(patient: Patient)
}
