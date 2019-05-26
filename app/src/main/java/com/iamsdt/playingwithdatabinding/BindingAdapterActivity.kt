package com.iamsdt.playingwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.iamsdt.playingwithdatabinding.databinding.ActivityBindingAdapterBinding
import timber.log.Timber

class BindingAdapterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBindingAdapterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter)

        binding.url =
            MyDataClass(
                name = "https://images.unsplash.com/photo-1517404215738-15263e9f9178?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"
                , id = 0, year = ""
            )
    }
}

//must declare as top level function
@BindingAdapter("loadImage")
fun loadImage(view: ImageView, url: String) {
    Timber.i("######## $url############")
    Glide.with(view.context)
        .load(url)
        .fitCenter()
        .into(view)
}
