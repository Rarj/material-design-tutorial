package dev.arj.tooltips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.TooltipCompat
import dev.arj.tooltips.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.buttonTooltips.setOnLongClickListener {
      TooltipCompat.setTooltipText(it, "Shopping Cart")

      false
    }

  }
}