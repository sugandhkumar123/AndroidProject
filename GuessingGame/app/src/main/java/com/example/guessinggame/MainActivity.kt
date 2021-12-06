package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    var randomVal= (Math.random()*10).toInt()
   // var randomVal= 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputView=findViewById<TextInputLayout>(R.id.inputfield)
        var clickMeButton=findViewById<TextView>(R.id.clickme)
        var displayme=findViewById<TextView>(R.id.diplayview)

        clickMeButton.setOnClickListener{
            val getText = inputView.editText?.text?.toString()
            if(getText.isNullOrEmpty())  displayme.text="Please Enter some Number"
            else if(getText.toInt() is Int) {
                val tempVal=getText.toInt()
                if ( tempVal> randomVal) displayme.text = "No:) My number is Smaller"
                else if (tempVal < randomVal) displayme.text = "No:) My number is Bigger"
                else displayme.text = "You are Right!!"
            }
            else {
                displayme.text="Please Enter Valid Number"
            }



        }

    }
}
