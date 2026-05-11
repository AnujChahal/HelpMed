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
    return when(this) {
        "cardiovascular" -> R.drawable.cardiovascular
        "diabetes" -> R.drawable.diabetes
        "epilepsy" -> R.drawable.epilepsy
        "asthma" -> R.drawable.asthma
        "cancer" -> R.drawable.cancer
        "alzheimer" -> R.drawable.alzheimer
        "tuberculosis" -> R.drawable.tuberculosis
        "hypertension" -> R.drawable.hypertension
        "kidney" -> R.drawable.kidney
        "liver" -> R.drawable.liver
        "migraine" -> R.drawable.migraine
        "anemia" -> R.drawable.anemia
        "osteoporosis" -> R.drawable.osteoporosis
        "depression" -> R.drawable.depression
        "pneumonia" -> R.drawable.pneumonia
        else -> R.drawable.health
    }
}