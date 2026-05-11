package com.synac.helpmed.uiDataClasses

data class ArticleUiDataClass(
    val name: String,
    val image: Int,
    val definition: String,
    val types: List<String>,
    val causes: List<String>,
    val symptoms: List<String>,
    val preventionStrategy: List<String>
)
