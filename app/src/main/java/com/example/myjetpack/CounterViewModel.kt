package com.example.myjetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var counter = MutableLiveData<Int>(0)

    fun decrementValue(){
        counter.value = counter.value?.minus(1)
    }

    fun incrementValue(){
        counter.value = counter.value?.plus(1)
    }
}