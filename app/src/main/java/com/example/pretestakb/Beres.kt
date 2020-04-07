package com.example.pretestakb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class Beres : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beres)
        val nama = intent.getStringExtra("textnama")
        val textberes = findViewById<TextView>(R.id.text_beres)
        val button = findViewById<Button>(R.id.btn_exit)

        if (nama == null){
            textberes.text = "Beres! Sekarang Kamu udah bisa ngecheck penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"
        }
        else {
            textberes.text = "Beres! Sekarang "+ nama + " udah bisa ngecheck penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"
        }
        button.setOnClickListener {
            finishAffinity()
        }
    }
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            finishAffinity()
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Press BACK again to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
    }
}
