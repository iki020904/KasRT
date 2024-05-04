package com.example.kasrt

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Inisialisasi ImageButton
        val imageButton0 = findViewById<ImageButton>(R.id.imageButton0)
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)

        // Menambahkan listener klik ke setiap ImageButton
        imageButton0.setOnClickListener {
            val pembayaran = Intent(this@MenuActivity, MainActivity::class.java)
            startActivity(pembayaran)
        }

        imageButton1.setOnClickListener {
            val report = Intent(this@MenuActivity, LaporanActivity::class.java)
            startActivity(report)
        }

    }
}