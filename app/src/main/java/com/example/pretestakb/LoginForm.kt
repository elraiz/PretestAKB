package com.example.pretestakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
        val button = findViewById<Button>(R.id.btn_beli)
        button.setOnClickListener {
            val intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        }
    }
}
