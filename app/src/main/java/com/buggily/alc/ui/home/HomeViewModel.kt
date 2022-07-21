package com.buggily.alc.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _value: MutableLiveData<String> = MutableLiveData(String())
    val value: LiveData<String> = _value

    fun onValueChange(value: String) {
        _value.value = value
    }
}