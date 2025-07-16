package com.example.clinicapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Clinic::class, Patient::class, Visit::class, Appointment::class, Finance::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun clinicDao(): ClinicDao
    abstract fun patientDao(): PatientDao
    abstract fun visitDao(): VisitDao
    abstract fun appointmentDao(): AppointmentDao
    abstract fun financeDao(): FinanceDao
}
