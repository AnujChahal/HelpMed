package com.synac.helpmed.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.synac.helpmed.repository.EmergencyRepository
import com.synac.helpmed.uiDataClasses.EmergencyUiDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class EmergencyViewModel @Inject constructor(
    private val emergencyRepository: EmergencyRepository
): ViewModel() {
    private val _emergencyContact = MutableStateFlow<List< EmergencyUiDataClass>> (emptyList())
    val emergencyContact: StateFlow<List<EmergencyUiDataClass>> = _emergencyContact

    init {
        getEmergencyContacts()
    }

    fun getEmergencyContacts() {
        viewModelScope.launch {
            _emergencyContact.value = emergencyRepository.getEmergencyData()
        }
    }
}