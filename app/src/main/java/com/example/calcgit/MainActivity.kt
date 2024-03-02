package com.example.calcgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        val nnum1 = findViewById<Button>(R.id.num1)
        val nnum2 = findViewById<Button>(R.id.num2)
        val nnum3 = findViewById<Button>(R.id.num3)
        val nnum4 = findViewById<Button>(R.id.num4)
        val nnum5 = findViewById<Button>(R.id.num5)
        val nnum6 = findViewById<Button>(R.id.num6)
        val nnum7 = findViewById<Button>(R.id.num7)
        val nnum8 = findViewById<Button>(R.id.num8)
        val nnum9 = findViewById<Button>(R.id.num9)
        val nnum0 = findViewById<Button>(R.id.num0)
        val dott = findViewById<Button>(R.id.dot)
        val clear = findViewById<Button>(R.id.ac)
        val delete = findViewById<Button>(R.id.delrete)
        val egual = findViewById<Button>(R.id.equal)
        val pls = findViewById<Button>(R.id.plus)
        val mns = findViewById<Button>(R.id.minus)
        val tims = findViewById<Button>(R.id.times)
        val divid = findViewById<Button>(R.id.divide)
        var hh = ""


        clear.setOnClickListener(){
            hh = ""
            text.text = ""
        }



        nnum1.setOnClickListener(){
            hh = hh + "1"
            text.text = hh
        }
        nnum2.setOnClickListener(){
            hh = hh + "2"
            text.text = hh
        }
        nnum3.setOnClickListener(){
            hh = hh + "3"
            text.text = hh
        }
        nnum4.setOnClickListener(){
            hh = hh + "4"
            text.text = hh
        }
        nnum5.setOnClickListener(){
            hh = hh + "5"
            text.text = hh
        }
        nnum6.setOnClickListener(){
            hh = hh + "6"
            text.text = hh
        }
        nnum7.setOnClickListener(){
            hh = hh + "7"
            text.text = hh
        }
        nnum8.setOnClickListener(){
            hh = hh + "8"
             text.text = hh
        }
        nnum9.setOnClickListener(){
            hh = hh + "9"
            text.text = hh
        }
        nnum0.setOnClickListener(){
            hh = hh + "0"
            text.text = hh
        }
        dott.setOnClickListener(){
            hh = hh + "."
            text.text = hh
        }
        pls.setOnClickListener(){
            hh = hh + "+"
            text.text = hh
        }
        mns.setOnClickListener(){
            hh = hh + "-"
            text.text = hh
        }
        tims.setOnClickListener(){
            hh = hh + "*"
            text.text = hh
        }
        divid.setOnClickListener(){
            hh = hh + "/"
            text.text = hh
        }

    }
}