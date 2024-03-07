package com.hamdiiii.app1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NubmersAdapter(private val data : List<Int>):RecyclerView.Adapter<NubmersAdapter.ViewHolder>() {

    class ViewHolder (val item: View):RecyclerView.ViewHolder(item){
        val textView=item.findViewById<TextView>(R.id.tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item ,parent,false))
    }

    override fun getItemCount(): Int =data.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.textView.text=position.toString()
    }
}