package com.modiss.challengech3

import android.app.Application
import com.modiss.challengech3.data.local.database.AppDatabase

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getInstance(this)
    }
}