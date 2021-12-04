package com.example.inputclickeddisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var countMan= mutableMapOf<String,Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countDisplayView=findViewById<TextView>(R.id.displayview)
        var clickMeButton=findViewById<TextView>(R.id.clickme)
        var inputDisplayView=findViewById<TextInputLayout>(R.id.inputfield)

        clickMeButton.setOnClickListener{
            val username = inputDisplayView.editText?.text?.toString()
            val checkUser=
                if(username.isNullOrEmpty()) "Somebody"
                else username.toLowerCase()

            val oldClickCount=countMan[checkUser] ?:0
            val newClickCount=oldClickCount+1

            countMan[checkUser]=newClickCount

            countDisplayView.text="${checkUser.toUpperCase()} clicked $newClickCount times"
        }
    }
}