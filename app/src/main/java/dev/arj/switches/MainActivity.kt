package dev.arj.switches

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

  private lateinit var switchWifi: SwitchMaterial

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    switchWifi = findViewById(R.id.switch_wifi)

    switchWifi.setOnCheckedChangeListener { _, isChecked ->
      if (isChecked) {
        Toast.makeText(this, "WiFi is enabled", Toast.LENGTH_SHORT).show()
      } else {
        Toast.makeText(this, "WiFi is disabled", Toast.LENGTH_SHORT).show()
      }
    }
  }

}