package com.iamsdt.playingwithdatabinding.arc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.recyclerview.widget.RecyclerView
import com.iamsdt.playingwithdatabinding.R
import com.iamsdt.playingwithdatabinding.databinding.RcvItemBinding

class RcvAdapter : RecyclerView.Adapter<RcvAdapter.RcvHolder>() {

    private var list: List<RcvModel> = emptyList()

    fun submitList(list: List<RcvModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcvHolder =
        RcvHolder.from(parent)

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RcvHolder, position: Int) {
        val model = list[position]
        holder.bind(model)
    }

    override fun onViewAttachedToWindow(holder: RcvHolder) {
        super.onViewAttachedToWindow(holder)
        holder.attach()
    }

    override fun onViewDetachedFromWindow(holder: RcvHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.detach()
    }


    class RcvHolder private constructor(private val binding: RcvItemBinding) :
        RecyclerView.ViewHolder(binding.root), LifecycleOwner {

        private val register = LifecycleRegistry(this)

        override fun getLifecycle(): Lifecycle = register

        init {
            register.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        }


        fun bind(model: RcvModel) {
            binding.model = model
            register.handleLifecycleEvent(Lifecycle.Event.ON_START)
        }

        fun attach() {
            register.handleLifecycleEvent(Lifecycle.Event.ON_START)

        }

        fun detach() {
            register.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        }

        companion object {
            fun from(parent: ViewGroup): RcvHolder {
                val binding = DataBindingUtil.inflate<RcvItemBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.rcv_item,
                    parent, false
                )

                return RcvHolder(binding)
            }

        }

    }

}

