package com.synac.helpmed.navigation

import androidx.navigation3.runtime.NavKey

@kotlinx.serialization.Serializable
data object EmergencyDestination: NavKey

@kotlinx.serialization.Serializable
data object ArticleListDestination: NavKey

@kotlinx.serialization.Serializable
data object ArticleDetailDestination: NavKey

@kotlinx.serialization.Serializable
data object MedicineListDestination: NavKey

@kotlinx.serialization.Serializable
data object MedicineDetailDestination: NavKey