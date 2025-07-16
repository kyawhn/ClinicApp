package com.example.clinicapp.data

import androidx.room.*

@Dao
interface AppointmentDao {
    @Query("SELECT * FROM appointments WHERE clinicId = :clinicId AND date BETWEEN :start AND :end")
    suspend fun getAppointmentsInRange(clinicId: Long, start: Long, end: Long): List<Appointment>
    @Query("SELECT * FROM appointments WHERE status = :status")
    suspend fun getByStatus(status: String): List<Appointment>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(appointment: Appointment): Long
    @Update
    suspend fun update(appointment: Appointment)
}
