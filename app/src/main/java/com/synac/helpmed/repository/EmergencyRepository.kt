package com.synac.helpmed.repository

import android.content.Context
import com.synac.helpmed.jsonParse.EmergencyParsing
import com.synac.helpmed.mapper.toUiModel
import com.synac.helpmed.uiDataClasses.EmergencyUiDataClass
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class EmergencyRepository @Inject constructor(@param:ApplicationContext private val context: Context) {
    //suspend fun getEmergencyData(): List<EmergencyUiDataClass> {
    fun getEmergencyData(): List<EmergencyUiDataClass> {
        return EmergencyParsing.loadEmergencyJsonFromRaw(
            context
        ).map { it.toUiModel() }
    }
}