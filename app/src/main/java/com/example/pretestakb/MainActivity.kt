package com.example.pretestakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//4 April 2020, Pembuatan Halaman Utama dan Button dan fungsi Mulai
//5 April 2020, Pembuatan Halaman Login dan Form Pendaftaran
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_mulai)
            button.setOnClickListener{
                val intent = Intent(this,LoginForm::class.java)
                startActivity(intent)
            }

    }
}
