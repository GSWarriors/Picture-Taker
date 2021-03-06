package com.example.picturetaker

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by JC on 17/07/2017.
 */
class Application : Application() {

    companion object {
        lateinit var instance: com.example.picturetaker.Application
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        Fresco.initialize(this)
    }
}