package com.synac.helpmed.mapper

import com.synac.helpmed.R
import com.synac.helpmed.data.ArticleDataClass
import com.synac.helpmed.uiDataClasses.ArticleUiDataClass

fun ArticleDataClass.toUiModel(): ArticleUiDataClass {
    return ArticleUiDataClass(
        name = name,
        image = image.toDrawableRes(),
        definition = definition,
        types = types,
        causes = causes,
        symptoms = symptoms,
        preventionStrategy = preventionStrategy
    )
}

private fun String.toDrawableRes(): Int {
    return try {
        R.drawable::class.java.getField(this).getInt(null)
    } catch (e: Exception) {
        R.drawable.health //change when article will be added
    }
}