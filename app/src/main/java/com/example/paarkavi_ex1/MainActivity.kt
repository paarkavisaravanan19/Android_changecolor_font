package com.example.paarkavi_ex1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv=findViewById<TextView>(R.id.text)
        val b1= findViewById<Button>(R.id.color)
        val b2= findViewById<Button>(R.id.font)
        var ch=1
        var f=30f
        b2.setOnClickListener()
        {
            tv.setTextSize(f)
            f=f+5
            if(f==50f)
            {
                f=30f
            }
        }
        b1.setOnClickListener()
        {
            when(ch)
            {
                1->tv.setTextColor(Color.parseColor("#ff8000"))
                2->tv.setTextColor(Color.parseColor("#1dc259"))
                3->tv.setTextColor(Color.parseColor("#391bbf"))
                4->tv.setTextColor(Color.parseColor("#b01581"))

            }
            ch++
            if(ch==4)
            {
                ch=1
            }
        }

    }
}