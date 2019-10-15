package com.example.desgindemoapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.card_row.view.*
import kotlinx.android.synthetic.main.harbo_row.view.*

class HarboAadapter(var context : Context, var harboItems:MutableList<harboItems>) : RecyclerView.Adapter<HarboAadapter.myViewHolder>()  {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.harbo_row,p0,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var myharbolist = harboItems[position]
        holder.setData(myharbolist,position)
    }

    override fun getItemCount(): Int {
        return harboItems.size
    }
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){



        fun setData(myharbolist : harboItems, position: Int){
//            itemView.row_layout.setBackgroundResource(myex.background)
//        itemView.row_image.setImageResource(myex.Image)
            itemView.row_build.setText(myharbolist.version)
            itemView.row_date.setText(myharbolist.dateandTime)
            itemView.harbo_row_info.setText(myharbolist.info)



        }
    }
}