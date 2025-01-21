package com.example.dagger2practice

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dagger2practice.simpleExample.AppComponent
import com.example.dagger2practice.simpleExample.Computer
import com.example.dagger2practice.ui.theme.Typography
import javax.inject.Inject

val Context.appComponent : AppComponent
  get() = when(this) {
    is MainApp -> appComponent
    else -> this.applicationContext.appComponent
  }

class MainActivity : ComponentActivity() {

  @Inject
  lateinit var computer: Computer

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    appComponent.inject(this)
    setContent {
      DisplayComputerProperties(computer)
    }
  }
}


@Composable
fun DisplayComputerProperties(computer: Computer) {
  Column(modifier = Modifier.fillMaxSize()) {
    Text(
      text = "RAM: ${computer.ram}",
      style = Typography.titleLarge)
    Spacer(Modifier.height(10.dp))
    Text(
      text = "Mother Board: ${computer.motherBoard}",
      style = Typography.titleLarge)
    Spacer(Modifier.height(10.dp))
    Text(
      text = "Processor: ${computer.processor}",
      style = Typography.titleLarge)
    Spacer(Modifier.height(10.dp))}
}