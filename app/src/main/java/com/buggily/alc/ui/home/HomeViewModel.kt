package com.buggily.alc.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class HomeViewModel(private val state: SavedStateHandle) : ViewModel() {

    private val _value: MutableLiveData<String> = state.getLiveData(VALUE, String())
    val value: LiveData<String> = _value

    fun onValueChange(value: String) {
        state[VALUE] = value
    }

    private companion object {
        private const val VALUE = "value"
    }
}