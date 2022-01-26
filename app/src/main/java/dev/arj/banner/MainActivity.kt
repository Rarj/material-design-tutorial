package dev.arj.banner

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

  private lateinit var containerBanner: ConstraintLayout
  private lateinit var buttonConnectMic: MaterialButton

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    containerBanner = findViewById(R.id.container_banner)
    buttonConnectMic = findViewById(R.id.button_connect_mic)

    buttonConnectMic.setOnClickListener {
      containerBanner.visibility = View.GONE
    }
  }
}