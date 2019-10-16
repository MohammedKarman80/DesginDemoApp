package com.example.desgindemoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class HarboDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harbo_details)


        var adapter =DetailsHarboAadapter(this)
        var recycerview: RecyclerView = findViewById(R.id.harbo_deatails_rv)
        var layoutmanger = LinearLayoutManager(this)
        layoutmanger.orientation = LinearLayoutManager.VERTICAL
        recycerview.layoutManager = layoutmanger
        recycerview.adapter = adapter

    }
}
