package com.buggily.skeleton.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _value: MutableLiveData<String> = MutableLiveData()
    val value: LiveData<String> = _value

    fun onValueChange(value: String) {
        _value.value = value
    }
}