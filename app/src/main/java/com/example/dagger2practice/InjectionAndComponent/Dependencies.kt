package com.example.dagger2practice.InjectionAndComponent

interface Engine{
  fun start()
}

class ElectricEngine : Engine {
  override fun start() {
    println("Start electric engine")
  }
}

class GasolineEngine: Engine {
  override fun start() {
    println("Start gasoline engine")
  }
}

class Car(private val engine: Engine) {
  fun launch() {
    engine.start()
  }
}