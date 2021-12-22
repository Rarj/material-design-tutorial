package dev.arj.checkboxes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.checkbox.MaterialCheckBox

class MainActivity : AppCompatActivity() {

  private lateinit var checkbox: MaterialCheckBox

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    checkbox = findViewById(R.id.checkbox_simple)

    checkbox.setOnCheckedChangeListener { _, isChecked ->
      if (isChecked) {
        Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show()
      } else {
        Toast.makeText(this, "Unchecked", Toast.LENGTH_SHORT).show()
      }
    }
  }
}