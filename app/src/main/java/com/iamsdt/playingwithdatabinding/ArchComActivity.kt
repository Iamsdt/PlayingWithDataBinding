package com.iamsdt.playingwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.iamsdt.playingwithdatabinding.databinding.ActivityArchComBinding

class ArchComActivity : AppCompatActivity() {

    lateinit var binding: ActivityArchComBinding

    /*
    IN this class edit text is implemented as
    one way databinding
    Used: text watcher
    to implement text watcher
     their is two way
     From xml: use android:afterTextChanged
     Note: Compile will show a warning, but ignore that
     From code:
     add text change listener

     And make a field observable
     */

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
