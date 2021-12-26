package com.example.foodshare.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.foodshare.databinding.ItemRecyclerViewBinding
import com.example.foodshare.model.RecyclerItem
import com.example.foodshare.viewmodel.MainViewModel
import com.example.foodshare.viewmodel.recyclerview.RecyclerItemViewModel
import com.example.foodshare.viewmodel.recyclerview.RecyclerViewModel

class RecyclerViewAdapter(
    private val items: MutableList<RecyclerItem>
) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding =
            ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        val viewModel: RecyclerItemViewModel =
            ViewModelProvider(binding.root.context as ViewModelStoreOwner).get(RecyclerItemViewModel::class.java)

        DataBindingUtil.bind<ItemRecyclerViewBinding>(binding.root)!!.apply {
            vm = viewModel
        }

        return RecyclerViewHolder(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        /** ignore */
    }

    inner class RecyclerViewHolder(binding: ItemRecyclerViewBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}