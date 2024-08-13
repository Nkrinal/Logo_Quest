package com.example.game

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ShowImage : AppCompatActivity() {

    lateinit var images:ImageView
    lateinit var layout: LinearLayout
    lateinit var slayout: LinearLayout
    lateinit var top: LinearLayout
    lateinit var stop: LinearLayout
    lateinit var botton: LinearLayout
    lateinit var sbotton: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_image)

        images=findViewById(R.id.images)
        layout=findViewById(R.id.layout)
        slayout=findViewById(R.id.slayout)
        top=findViewById(R.id.top)
        stop=findViewById(R.id.stop)
        botton=findViewById(R.id.botton)
        sbotton=findViewById(R.id.sbotton)

        var im=intent.getIntExtra("img",0)
        var ans=intent.getStringExtra("ans")

        images.setImageResource(im)

        for(i in 0 until ans!!.length)
        {
            val textView2 = TextView(this)
            val textView1 = TextView(this)
            textView2.textSize = 20f
            textView2.setBackgroundColor(Color.BLACK)
            val paramss = LinearLayout.LayoutParams(
                80,80
            )
            paramss.setMargins(5,10,5,10)
            textView2.setLayoutParams(paramss)
            textView2.setTextColor(resources.getColor(android.R.color.black))
            textView2.setBackgroundResource(R.color.white)

            textView2.setText(ans[i].toString())
            textView2.setOnClickListener {
                    textView1.setText(textView2.text.toString())
                    textView2.setText("")
                textView2.postDelayed({
                    stop.removeView(textView2)
                }, 1)
                textView2.postDelayed({
                    sbotton.removeView(textView2)
                }, 1)
            }

            textView1.textSize = 20f
            textView1.setBackgroundColor(Color.BLACK)
            val params = LinearLayout.LayoutParams(
                75,75
            )
            params.setMargins(5,10,5,10)
            textView1.setLayoutParams(params)
            textView1.setTextColor(resources.getColor(android.R.color.black))
            textView1.setBackgroundResource(R.color.white)
            if(i<5)
            {
                stop.addView(textView2)
                top.addView(textView1)
            }
            else
            {
                sbotton.addView(textView2)
                botton.addView(textView1)
            }

        }


    }


}