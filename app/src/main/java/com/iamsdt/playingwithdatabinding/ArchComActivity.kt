package com.iamsdt.playingwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.iamsdt.playingwithdatabinding.databinding.ActivityArchComBinding

class ArchComActivity : AppCompatActivity() {

    lateinit var binding: ActivityArchComBinding


    val vm: MyViewModel by lazy {
        ViewModelProviders.of(this).get(MyViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_arch_com)
        binding.lifecycleOwner = this
        binding.model = vm
    }
}
