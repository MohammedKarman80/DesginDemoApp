package com.example.desgindemoapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import kotlinx.android.synthetic.main.card_row.view.*
import kotlinx.android.synthetic.main.harbo_row.view.*

class DetailsHarboAadapter(var context : Context) : RecyclerView.Adapter<DetailsHarboAadapter.myViewHolder>()  {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.harbo_details_row,p0,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
       holder.setData()
    }

    override fun getItemCount(): Int {
        return 12
    }
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
   fun setData() {
            context?.let {
                Glide.with(it)
                    .load(R.drawable.logo3)
                    .apply(RequestOptions.circleCropTransform())
                    .into(itemView.findViewById(R.id.row_logo))
            }
        }



    }
}