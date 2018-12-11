package com.gurukul.actv_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values:Array<String> = getResources().getStringArray(R.array.countries)
        //val values = arrayOf("Srilanka","South Africa","Soudi Arebia")
        val myAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,values)

        actv.setAdapter(myAdapter)
        actv.threshold = 1
    }
}
