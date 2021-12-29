package dev.arj.snackbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

  private lateinit var deleteButton: MaterialButton
  private lateinit var container: ConstraintLayout

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    deleteButton = findViewById(R.id.button_delete_photo)
    container = findViewById(R.id.container_snackbar)

    deleteButton.setOnClickListener {
      Snackbar.make(container, "Foto Anda berhasil dihapus", Snackbar.LENGTH_LONG)
        .setAction("UNDO") {
          Snackbar.make(
            container,
            "Foto berhasil dikembalikan. Periksa galeri Anda",
            Snackbar.LENGTH_SHORT
          ).show()
        }.show()
    }
  }
}