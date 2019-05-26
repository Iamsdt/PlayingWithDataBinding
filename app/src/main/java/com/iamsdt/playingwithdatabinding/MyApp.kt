package com.iamsdt.playingwithdatabinding

import android.app.Application
import com.iamsdt.androidextension.DebugLogTree
import com.rohitss.uceh.UCEHandler
import timber.log.Timber

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        UCEHandler.Builder(this).build()
        Timber.plant(DebugLogTree())
    }

}