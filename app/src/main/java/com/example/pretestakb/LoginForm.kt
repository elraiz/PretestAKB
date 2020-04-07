package com.example.pretestakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login_form.*

class LoginForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)
        val buttonmasuk = findViewById<Button>(R.id.btn_masuk)
        val getkode = findViewById<EditText>(R.id.inputkode)
        buttonmasuk.setOnClickListener {
            val kode = getkode.text.toString()
            if (kode.isEmpty()){
                inputkode.setError("Kode Harus Diisi")
            }
            else{
                val intent = Intent(this, Daftar::class.java)
                startActivity(intent)
            }

        }
    }
}
