package com.example.dagger2practice.simpleExample

import com.example.dagger2practice.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [ComputerProvider::class])
interface AppComponent {
  fun inject(mainActivity: MainActivity)
  val computer : Computer
}

@Module
object ComputerProvider {

  @Provides
  fun provideComputer(
    processor: Processor,
    ram: RAM,
    motherBoard: MotherBoard
  ): Computer {
    return Computer(
      processor = processor,
      ram = ram,
      motherBoard = motherBoard
    )
  }

  @Provides
  fun providesRAM(): RAM {
    return RAM()
  }

  @Provides
  fun providesMotherboard(): MotherBoard {
    return MotherBoard()
  }

  @Provides
  fun providesProcessor(): Processor {
    return Processor()
  }
}