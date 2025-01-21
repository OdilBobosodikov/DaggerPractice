package com.example.dagger2practice

import android.app.Application
import com.example.dagger2practice.simpleExample.AppComponent
import com.example.dagger2practice.simpleExample.DaggerAppComponent

class MainApp : Application() {
  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.create()
  }
}