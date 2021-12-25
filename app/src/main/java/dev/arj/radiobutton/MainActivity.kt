package dev.arj.radiobutton

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  private lateinit var radioGroup: RadioGroup

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    radioGroup = findViewById(R.id.radio_group)

    radioGroup.setOnCheckedChangeListener { radioGroup, _ ->
      when (radioGroup.checkedRadioButtonId) {
        R.id.radio_button_1 -> {
          Toast.makeText(this, "Kantor checked", Toast.LENGTH_SHORT).show()
        }
        R.id.radio_button_2 -> {
          Toast.makeText(this, "Rumah checked", Toast.LENGTH_SHORT).show()
        }
        R.id.radio_button_3 -> {
          Toast.makeText(this, "Apartment checked", Toast.LENGTH_SHORT).show()
        }
      }
    }
  }
}