package com.example.dagger2practice.simpleExample

class Processor()
{
  override fun toString(): String {
    return "AB20021"
  }
}

class MotherBoard()
{
  override fun toString(): String {
    return "X7 3000"
  }
}

class RAM()
{
  override fun toString(): String {
    return "16 GB"
  }
}

data class Computer(
  val processor: Processor,
  val motherBoard: MotherBoard,
  val ram: RAM
)