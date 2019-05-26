package com.iamsdt.playingwithdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.iamsdt.playingwithdatabinding.databinding.ItemBinding

class MyAdapter(private val list: List<MovieList>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder.from(parent)

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }


    class MyViewHolder private constructor(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieList) {
            binding.model = movie
            //it will make faster to process views
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup): MyViewHolder {

                val binding = DataBindingUtil.inflate<ItemBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.item,
                    parent, false
                )

                return MyViewHolder(binding)
            }
        }

    }

}