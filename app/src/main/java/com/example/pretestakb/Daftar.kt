package com.example.pretestakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_daftar.*

class Daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        val getnama = findViewById<EditText>(R.id.inputnama)
        val getumur = findViewById<EditText>(R.id.inputumur)
        val button = findViewById<Button>(R.id.btn_selanjutnya)
        button.setOnClickListener {
            val nama = getnama.text.toString()
            val umur = getumur.text.toString()
            if (nama.isEmpty()){
                inputnama.setError("Nama Harus Diisi")
            }
            if (umur.isEmpty()){
                inputumur.setError("Umur Harus Diisi")
            }
            if (nama.isNotEmpty() && umur.isNotEmpty()){
                val intent = Intent(this, Beres::class.java)
                intent.putExtra("textnama", nama)
                startActivity(intent)
            }

        }
    }
}
