package com.synac.helpmed.mapper

import com.synac.helpmed.R
import com.synac.helpmed.data.EmergencyDataClass
import com.synac.helpmed.uiDataClasses.EmergencyUiDataClass

fun EmergencyDataClass.toUiModel(): EmergencyUiDataClass{
    return EmergencyUiDataClass(
        name = name,
        phoneNumber = phoneNumber,
        icons = icons.toDrawableRes()
    )
}

private fun String.toDrawableRes(): Int {
    return try {
        R.drawable::class.java.getField(this).getInt(null)
    } catch (e: Exception) {
        R.drawable.health
    }
}