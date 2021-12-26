package com.example.foodshare.viewmodel.recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecyclerItemViewModel(
    var title: MutableLiveData<String> = MutableLiveData()
) : ViewModel() {

}