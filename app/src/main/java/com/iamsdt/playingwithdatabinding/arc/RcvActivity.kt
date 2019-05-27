package com.iamsdt.playingwithdatabinding.arc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iamsdt.playingwithdatabinding.R
import com.iamsdt.playingwithdatabinding.databinding.ActivityRcvBinding

class RcvActivity : AppCompatActivity() {

    private val vm: RcvViewModel by lazy {
        ViewModelProviders.of(this).get(RcvViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityRcvBinding>(
            this, R.layout.activity_rcv
        )
        binding.lifecycleOwner = this
        binding.rcv.adapter = RcvAdapter()
        binding.rcv.layoutManager = LinearLayoutManager(this)
        binding.vm = vm
        vm.insertDummyData()
    }
}

@BindingAdapter("submitList")
fun RecyclerView.submitData(list: List<RcvModel>?) {
    val myAdapter = adapter as RcvAdapter
    if (list != null) myAdapter.submitList(list)
}
