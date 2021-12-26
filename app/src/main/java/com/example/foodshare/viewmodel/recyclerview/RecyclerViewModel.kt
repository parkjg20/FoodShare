package com.example.foodshare.viewmodel.recyclerview

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel

class RecyclerViewModel(
    val itemViewModels: ObservableArrayList<RecyclerItemViewModel> = ObservableArrayList<RecyclerItemViewModel>()
): ViewModel() {

    fun addItem(item: RecyclerItemViewModel) {
        itemViewModels.add(item)
    }
}