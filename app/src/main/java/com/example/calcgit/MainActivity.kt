package com.example.calcgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

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
        val coler = findViewById<Button>(R.id.cover)
        val coler2 = findViewById<Button>(R.id.cover2)
        var lis = mutableListOf<String>()
        var oo = ""
        var hh = ""



        egual.setOnClickListener(){

            //val hh: Array<String> = arrayOf("1", "3", "2", "4", "+", "4", "-", "3", "3", "*", "5", "8", "0", "-", "4", "5", "/", "4")
            val jj = mutableListOf<String>()
            val pp = mutableListOf<String>()
            val oo = mutableListOf<String>()
            var sigh1 = ""
            var l = ""
            var num1 = 0
            var nn = 0

            var num2 = 0
            pp.add("")
            for (gg in lis) {
                if (gg == "+" || gg == "-" || gg == "*" || gg == "/") {
                    pp.add(gg)
                    jj.add("|")
                } else {
                    jj.add(gg)
                }


            }
            jj.add("|")
            for (kk in jj) {
                if (kk != "|") {
                    l = l + kk
                } else {
                    oo.add(l)
                    l = ""
                }
            }
            for (aa in oo.indices){

                // if(aa % 2 == 0){
                num2 = oo[aa].toInt()
                sigh1 = pp[aa]
                when(sigh1){
                    "+" -> num1 = num1 + num2
                    "-" -> num1 = num1 - num2
                    "*" -> num1 = num1 * num2
                    "/" -> num1 = num1 / num2
                    "" -> num1 = num1 + num2
                }

                num2 = 0
                nn = nn + 1

            }
            val res: String = num1.toString()
            text.text = res
            lis.clear()
            lis.add(res)



        }





        clear.setOnClickListener(){
            hh = ""
            text.text = ""

        }

        delete.setOnClickListener(){
        }

        nnum1.setOnClickListener(){
            hh = hh + "1"
            text.text = hh
            lis.add("1")
        }
        nnum2.setOnClickListener(){
            hh = hh + "2"
            text.text = hh
            lis.add("2")
        }
        nnum3.setOnClickListener(){
            hh = hh + "3"
            text.text = hh
            lis.add("3")
        }
        nnum4.setOnClickListener(){
            hh = hh + "4"
            text.text = hh
            lis.add("4")
        }
        nnum5.setOnClickListener(){
            hh = hh + "5"
            text.text = hh
            lis.add("5")
        }
        nnum6.setOnClickListener(){
            hh = hh + "6"
            text.text = hh
            lis.add("6")
        }
        nnum7.setOnClickListener(){
            hh = hh + "7"
            text.text = hh
            lis.add("7")
        }
        nnum8.setOnClickListener(){
            hh = hh + "8"
             text.text = hh
            lis.add("8")
        }
        nnum9.setOnClickListener(){
            hh = hh + "9"
            text.text = hh
            lis.add("9")
        }
        nnum0.setOnClickListener(){
            hh = hh + "0"
            text.text = hh
            lis.add("0")
        }
        dott.setOnClickListener(){
            hh = hh + "."
            text.text = hh
            lis.add(".")
        }
        pls.setOnClickListener(){
            hh = hh + "+"
            text.text = hh
            lis.add("+")
        }
        mns.setOnClickListener(){
            hh = hh + "-"
            text.text = hh
            lis.add("-")
        }
        tims.setOnClickListener(){
            hh = hh + "*"
            text.text = hh
            lis.add("*")
        }
        divid.setOnClickListener(){
            hh = hh + "/"
            text.text = hh
            lis.add("/")
        }
        coler.setOnClickListener(){
            hh = hh + "("
            text.text = hh
            lis.add("(")
        }
        coler2.setOnClickListener(){
            hh = hh +")"
            text.text = hh
            lis.add(")")
        }

    }
}