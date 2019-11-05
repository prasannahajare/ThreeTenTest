package com.sample.threetentest

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import java.util.*


class ThreeTenApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val resources = this.getResources()
        val displayMetrics = resources.getDisplayMetrics()
        val configuration = resources.getConfiguration()
        configuration.setLocale(Locale("pt","BR"))
        resources.updateConfiguration(configuration, displayMetrics)

        AndroidThreeTen.init(this)
    }
}