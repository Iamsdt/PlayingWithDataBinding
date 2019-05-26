package com.iamsdt.playingwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.iamsdt.playingwithdatabinding.databinding.ActivityObserableBinding

class ObserableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityObserableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_obserable)
        binding.student = Student("Data")
    }
}
