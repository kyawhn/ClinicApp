package com.example.clinicapp.repository

import com.example.clinicapp.data.*

class ClinicRepository(
    private val clinicDao: ClinicDao,
    private val patientDao: PatientDao,
    private val visitDao: VisitDao,
    private val appointmentDao: AppointmentDao,
    private val financeDao: FinanceDao
) {
    suspend fun getAllClinics() = clinicDao.getAll()
    suspend fun addClinic(clinic: Clinic) = clinicDao.insert(clinic)
    // Add more as needed
}
