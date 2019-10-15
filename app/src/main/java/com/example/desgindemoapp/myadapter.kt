package com.example.desgindemoapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.card_row.view.*

class myadapter(var context : Context, var ex:MutableList<exercises>) : RecyclerView.Adapter<myadapter.myViewHolder>()  {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.card_row,p0,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var myex = ex[position]
        holder.setData(myex,position)
    }

    override fun getItemCount(): Int {
        return ex.size
    }
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){



        fun setData(myex : exercises, position: Int){
            itemView.row_layout.setBackgroundResource(myex.background)
        itemView.row_image.setImageResource(myex.Image)



        }
    }
}