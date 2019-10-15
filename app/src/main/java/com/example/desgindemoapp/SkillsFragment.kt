package com.example.desgindemoapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.skills_fragment.*
import kotlinx.android.synthetic.main.skills_fragment.view.*
import kotlinx.android.synthetic.main.skills_fragment.view.button

class SkillsFragment : Fragment(),View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =inflater.inflate(R.layout.skills_fragment,container,false)
        var text :  String= view.span_text.text.toString()
        val button1 : TabLayout = view.findViewById(R.id.button)
        view.span_text.setText( setBoldSpannable(text))
        view.card_view1.setOnClickListener(this)
        view.card_view2.setOnClickListener(this)
        view.card_view3.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
      when(v!!.id){
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