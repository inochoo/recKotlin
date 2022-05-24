package com.sibaamap.reckotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibaamap.reckotlin.Adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcy_view_items.layoutManager = LinearLayoutManager(this)

        val itemAdapter = ItemAdapter(this,getItemsList())

        rcy_view_items.adapter = itemAdapter

    }

    private fun getItemsList(): ArrayList<String>{
        val list = ArrayList<String>()

        for(i in 1..30){
            list.add("Item $i")

        }
        return list
    }
}