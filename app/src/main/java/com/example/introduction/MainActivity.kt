package com.example.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonWatch:Button
    lateinit var ButtonRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonWatch=findViewById(R.id.btnwatch)
        ButtonRegister=findViewById(R.id.BtnRegister)

        ButtonWatch.setOnClickListener {
            val intention=Intent(this,WatchingActivity::class.java)
            startActivity(intention)
        }
        ButtonRegister.setOnClickListener {
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}