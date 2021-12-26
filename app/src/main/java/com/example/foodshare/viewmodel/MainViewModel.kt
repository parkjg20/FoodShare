package com.example.foodshare.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodshare.model.RecyclerItem
import com.example.foodshare.viewmodel.recyclerview.RecyclerViewModel

class MainViewModel() : ViewModel() {

    var text: MutableLiveData<String> = MutableLiveData("Hello World!")

    var recyclerViewItems: MutableList<RecyclerItem> = mutableListOf()

    fun onLeftButtonClick() {
        Log.d("MainViewModel", "Hi, This is Left Button")
        text.value = "Left Button Clicked"
    }

    fun onRightButtonClick() {
        Log.d("MainViewModel", "Hi, This is Right Button")
        text.value = "Right Button Clicked"
    }
}