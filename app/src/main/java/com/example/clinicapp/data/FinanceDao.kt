package com.example.clinicapp.data

import androidx.room.*

@Dao
interface FinanceDao {
    @Query("SELECT * FROM finances WHERE clinicId = :clinicId AND type = :type AND date BETWEEN :start AND :end")
    suspend fun getFinanceRecords(clinicId: Long, type: String, start: Long, end: Long): List<Finance>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(finance: Finance): Long
    @Update
    suspend fun update(finance: Finance)
}
