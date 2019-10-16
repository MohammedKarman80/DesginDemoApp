package com.example.desgindemoapp

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_details_skills.*
import kotlinx.android.synthetic.main.harbor_fragment.*

class HarborFragemnt : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.harbor_fragment,container,false)

        var harbolist =Lists.harboList
        var adapter = HarboAadapter(view.context,harbolist)
        var recycerview: RecyclerView = view.findViewById(R.id.harbo_recycler_view)
        var layoutmanger = LinearLayoutManager(view.context)
        layoutmanger.orientation = LinearLayoutManager.VERTICAL
        recycerview.layoutManager = layoutmanger
        recycerview.adapter = adapter
        var button : Button= view.findViewById(R.id.download_btn)

       button.setOnClickListener {
            val intent = Intent (getActivity(), HarboDetails::class.java)
            getActivity()!!.startActivity(intent)
        }

        context?.let {
            Glide.with(it)
                .load(R.drawable.logo3)
                .apply(RequestOptions.circleCropTransform())
                .into(view.findViewById(R.id.logo_image))
        }

        return view


    }



}