package com.iamsdt.playingwithdatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.iamsdt.androidextension.nextActivity
import com.iamsdt.playingwithdatabinding.arc.RcvActivity
import com.iamsdt.playingwithdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val model = MyModel(listOf("", "Trafder", "", "", ""))
        binding.model = model
        nextActivity<RcvActivity>()
    }
}
