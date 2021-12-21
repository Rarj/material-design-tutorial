package dev.arj.timepickers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//    val picker = MaterialTimePicker.Builder()
//        .setTimeFormat(TimeFormat.CLOCK_12H)
//        .setHour(12)
//        .setMinute(10)
//        .setTitleText("Select Appointment time")
//        .build()
//    picker.show(supportFragmentManager, "ALARM")
  }
}