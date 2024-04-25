package com.example.leilao


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.leilao.ui.theme.LeilaoTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        window.statusBarColor= ContextCompat.getColor(this@MainActivity,R.color.pink)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}