package com.example.desgindemoapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.skills_fragment.*
import kotlinx.android.synthetic.main.skills_fragment.view.*
import kotlinx.android.synthetic.main.skills_fragment.view.button

class SkillsFragment : Fragment(),View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =inflater.inflate(R.layout.skills_fragment,container,false)
        var text :  String= view.span_text.text.toString()

        view.span_text.setText( setBoldSpannable(text))
        view.button.setOnClickListener(this)
        view.button2.setOnClickListener(this)
        view.button3.setOnClickListener(this)
        view.card_view1.setOnClickListener(this)
        view.card_view2.setOnClickListener(this)
        view.card_view3.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
      when(v!!.id){
          R.id.button -> {
             button.setBackgroundResource(R.drawable.blue_custome_button)
              button2.setBackgroundResource(R.drawable.custome_button)
              button3.setBackgroundResource(R.drawable.custome_button)
          }
          R.id.button2 ->{
              button2.setBackgroundResource(R.drawable.blue_custome_button)
              button.setBackgroundResource(R.drawable.custome_button)
              button3.setBackgroundResource(R.drawable.custome_button)
          }
          R.id.button3 ->{
              button3.setBackgroundResource(R.drawable.blue_custome_button)
              button.setBackgroundResource(R.drawable.custome_button)
              button2.setBackgroundResource(R.drawable.custome_button)
          }
          R.id.card_view1, R.id.card_view2, R.id.card_view3->{
              val intent = Intent (getActivity(), DetailsSkillsActivity::class.java)
              getActivity()!!.startActivity(intent)

          }

      }
    }

    fun setBoldSpannable(myText: String): SpannableString {
        val spannableContent = SpannableString(myText)
        spannableContent.setSpan(ForegroundColorSpan(Color.BLUE), 6,  13, 0)

        return spannableContent
    }
}