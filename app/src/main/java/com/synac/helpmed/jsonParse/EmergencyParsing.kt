package com.synac.helpmed.jsonParse

import android.content.Context
import com.synac.helpmed.R
import com.synac.helpmed.data.EmergencyDataClass
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object EmergencyParsing {

    //suspend fun loadEmergencyJsonFromRaw(context: Context): List<EmergencyDataClass> {
    fun loadEmergencyJsonFromRaw(context: Context): List<EmergencyDataClass> {

        val inputStream = context.resources.openRawResource(R.raw.emergency)

        val reader = inputStream.bufferedReader().use { it.readText() }

        val listType = object : TypeToken<List<EmergencyDataClass>>() {}.type

        return Gson().fromJson(reader, listType)
    }
}