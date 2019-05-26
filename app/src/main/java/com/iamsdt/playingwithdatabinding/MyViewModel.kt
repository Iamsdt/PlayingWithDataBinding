package com.iamsdt.playingwithdatabinding

import android.text.Editable
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.util.*

class MyViewModel : ViewModel() {

    val watcher = ObservableField<String>()

    val name = MutableLiveData<String>()

    fun saveData(string: String) {
        name.value = string
    }

    fun btn_click() {
        val string = watcher.get()
        name.value = string
        Log.e("ViewMOdel", "Value set $string")
        Timber.e("Value set $string")
    }

    fun saveValue(edit: Editable) {
        val str = edit.toString()
        watcher.set(str)
        name.value = str
        Timber.i("Value set $str")
    }
}