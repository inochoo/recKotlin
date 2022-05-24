package com.sibaamap.reckotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sibaamap.reckotlin.R
import kotlinx.android.synthetic.main.item_custom.view.*


import java.security.AccessControlContext

class ItemAdapter(val context: Context, val items: ArrayList<String>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_custom,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items.get(position)
        holder.tvItem.text = item

        if(position % 2 == 0){
            holder.cardViewItem.setBackgroundColor(ContextCompat.getColor(context,R.color.purple_200))
        }else{
            holder.cardViewItem.setBackgroundColor(ContextCompat.getColor(context,R.color.purple_700))
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.tv_item_name
        val cardViewItem = view.card_view_item
    }

}