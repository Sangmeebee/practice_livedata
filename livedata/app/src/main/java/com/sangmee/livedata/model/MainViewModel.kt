package com.sangmee.livedata.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val currentName : MutableLiveData<String> = MutableLiveData<String>()
}
