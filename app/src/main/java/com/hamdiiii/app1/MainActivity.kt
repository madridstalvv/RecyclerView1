package com.hamdiiii.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView =findViewById<RecyclerView>(R.id.recyclerview1)
        recyclerView.adapter=NubmersAdapter(getData())
    }

    private fun getData():List<Int>{
val list =ArrayList<Int>()
        for (item in 0 .. 100){
            list.add(item)
        }
        return list;
    }

}