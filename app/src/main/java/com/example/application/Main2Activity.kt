package com.example.application

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)
    }

    fun aCancel(view: View) {
        val enterTo = Intent(this, MainActivity::class.java)
        startActivity(enterTo)
    }
}


