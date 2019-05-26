package com.iamsdt.playingwithdatabinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.iamsdt.playingwithdatabinding.databinding.ItemBinding

class MyAdapter(private val list: List<MovieList>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = DataBindingUtil.inflate<ItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item,
            parent, false
        )

        return MyViewHolder(binding.root)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var binding = DataBindingUtil.bind<ItemBinding>(view)

        fun bind(movie: MovieList) {
            binding?.model = movie
        }
    }

}