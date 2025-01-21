package com.example.dagger2practice.InjectionAndComponent.Classes

import com.example.dagger2practice.BuildConfig

class Fuel {
  private val fuelType = if(BuildConfig.DEBUG) {
    "benzine"
  }else{
    "diesel"
  }
}