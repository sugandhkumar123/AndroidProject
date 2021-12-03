package com.example.clickedtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var temp="";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickRedView=findViewById<TextView>(R.id.red)
        val clickGreenView=findViewById<TextView>(R.id.green)
        val clickBlueView=findViewById<TextView>(R.id.blue)
        val displayView=findViewById<TextView>(R.id.displaytext)

        clickRedView.setOnClickListener{
            temp=clickRedView.text.toString()
            displayView.text="$temp was Clicked"
        }

        clickGreenView.setOnClickListener{
            temp=clickGreenView.text.toString()
            displayView.text="$temp was Clicked"
        }

        clickBlueView.setOnClickListener{
            temp=clickBlueView.text.toString()
            displayView.text="$temp was Clicked"
        }
    }
}