package com.example.tugasviewgroup

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() , View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_sneaker1)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivity2: Button = findViewById(R.id.btn_sneaker2)
        btnMoveActivity2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_sneaker1 -> {
                val moveIntent = Intent(this@MainActivity, Sneakers1::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_sneaker2 -> {
                val moveIntent2 = Intent(this@MainActivity, Sneakers2::class.java)
                startActivity(moveIntent2)
            }
        }
    }
}