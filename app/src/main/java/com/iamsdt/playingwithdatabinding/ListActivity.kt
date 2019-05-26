package com.iamsdt.playingwithdatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.iamsdt.playingwithdatabinding.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list)
        binding.rcv.layoutManager = LinearLayoutManager(this)
        binding.rcv.adapter = MyAdapter(getList())
    }

    private fun getList() = listOf(
        MovieList("Title 1", "2019"),
        MovieList("Title 2", "2018"),
        MovieList("Title 3", "2017"),
        MovieList("Title 4", "2016"),
        MovieList("Title 5", "2015"),
        MovieList("Title 6", "2014")
    )
}
