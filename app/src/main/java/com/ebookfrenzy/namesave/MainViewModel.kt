package com.ebookfrenzy.namesave

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var input: MutableLiveData<String> = MutableLiveData()
    var output: MutableLiveData<String> = MutableLiveData()

    fun addName() {
        input.let {
            if (!it.value.equals("")) {
                output.value = input.value.toString()
            } else {
                output.value = "No Name Entered"
            }
        }
    }
}