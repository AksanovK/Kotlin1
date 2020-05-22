package com.example.application

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun aClick(view: View) {
        val am: Array<String> = arrayOf("aksanovkamil@gmail.com", "112358Ak")
        val ir: Array<String> = arrayOf("itisonelove@mail.ru", "112358Ir")
        val mh: Array<String> = arrayOf("abvgd@gmail.com", "112358Mh")

        val email = editTextMail.text.toString()

        val pas = editTextPassword.text.toString()

        if (((email == am[0])||(email == ir[0])||(email == mh[0]))&&((pas == am[1])||(pas == ir[1])||(pas == mh[1]))) {
            if ((email == am[0])&&(pas == am[1])) {
                val enterTo = Intent(this, Main2Activity::class.java)
                startActivity(enterTo)
            }
            if ((email == ir[0])&&(pas == ir[1])) {
                val enterTo = Intent(this, Main2Activity2::class.java)
                startActivity(enterTo)
            }
            if ((email == mh[0])&&(pas == mh[1])) {
                val enterTo = Intent(this, Main3Activity::class.java)
                startActivity(enterTo)
            }
        }
        else
        {
            val myToast = Toast.makeText(this, "Неверно введена почта или пароль", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}
