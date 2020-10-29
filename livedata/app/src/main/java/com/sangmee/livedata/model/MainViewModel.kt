package com.sangmee.livedata.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val num = MutableLiveData<Int>(0)

    fun increase() {
        num.value = num.value?.plus(1)
    }

    fun decrease() {
        num.value = num.value?.minus(1)
    }
}
