package com.iamsdt.playingwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.iamsdt.playingwithdatabinding.databinding.ActivityExpersionBinding

class ExpersionActivity : AppCompatActivity() {

    lateinit var binding: ActivityExpersionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_expersion)

        binding.model = MyDataClass(null,2,null)
    }
}

class MyDataClass(
    val name: String?,
    val id: Int,
    var year: String?
)
