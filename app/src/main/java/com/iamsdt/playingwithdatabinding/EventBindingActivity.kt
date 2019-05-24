package com.iamsdt.playingwithdatabinding

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.iamsdt.playingwithdatabinding.databinding.ActivityEventBindingBinding

class EventBindingActivity : AppCompatActivity() {

    lateinit var binding: ActivityEventBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_event_binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_event_binding)
        binding.handler = Handler(this)
        binding.name = "Shudipto"
    }
}

class Handler(val context: Context) {

    fun clickMe2(view: View) {
        Toast.makeText(view.context, "Click", Toast.LENGTH_SHORT).show()
    }

    fun clickMe3(view: View) {
        Toast.makeText(view.context, "Click", Toast.LENGTH_SHORT).show()
    }

    fun clickMe4() {
        Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
    }

    fun clickMe5(string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }

}
