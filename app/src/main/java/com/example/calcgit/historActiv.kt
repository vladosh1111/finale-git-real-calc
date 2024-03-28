package com.example.calcgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class historActiv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_histor)

        val num = intent.getStringArrayExtra("keyy")?: arrayOf()
        val adap = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, num)

        val lsw: ListView = findViewById<View>(R.id.viv) as ListView

        lsw.adapter = adap

    }
}