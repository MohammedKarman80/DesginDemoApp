package com.example.desgindemoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_details_skills.*

class DetailsSkillsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_skills)
        glide()
        var ex =Lists.exList
        var adapter = myadapter(this,ex)
        var recycerview:RecyclerView = findViewById(R.id.row_recycler)
        var layoutmanger = LinearLayoutManager(this)
        layoutmanger.orientation = LinearLayoutManager.HORIZONTAL
        recycerview.layoutManager = layoutmanger
        recycerview.adapter = adapter

    }

    fun glide(){
        Glide.with(this)
            .load(R.drawable.ic_avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(user_image)

        Glide.with(this)
            .load(R.drawable.ic_avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(user_image2)

        Glide.with(this)
            .load(R.drawable.ic_avatar)
            .apply(RequestOptions.circleCropTransform())
            .into(user_image3)

    }
}
