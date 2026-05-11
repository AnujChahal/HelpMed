package com.synac.helpmed.repository

import android.content.Context
import com.synac.helpmed.data.MedicineDataClass
import com.synac.helpmed.jsonParse.MedicineParsing
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MedicineRepository @Inject constructor(@param:ApplicationContext private val context: Context) {
    suspend fun getMedicineData(): List<MedicineDataClass>{
        return MedicineParsing.loadMedicineJsonFromRaw(
            context
        )
    }
}