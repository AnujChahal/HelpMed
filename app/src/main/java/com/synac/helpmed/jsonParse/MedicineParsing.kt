package com.synac.helpmed.jsonParse

import android.content.Context
import com.synac.helpmed.R
import kotlinx.coroutines.Dispatchers
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.synac.helpmed.data.MedicineDataClass
import kotlinx.coroutines.withContext

object MedicineParsing {

    suspend fun loadMedicineJsonFromRaw(context: Context): List<MedicineDataClass> =
        withContext(Dispatchers.IO) {

            val inputStream = context.resources.openRawResource(R.raw.medicine)

            val reader = inputStream.bufferedReader().use { it.readText() }

            val listType = object : TypeToken<List<MedicineDataClass>>() {}.type

            Gson().fromJson(reader, listType)
        }
}