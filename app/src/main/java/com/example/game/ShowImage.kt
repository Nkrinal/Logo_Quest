package com.example.game

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
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

        val font = Typeface.createFromAsset(assets,"font.ttf")
        var im=intent.getIntExtra("img",0)
        var ans=intent.getStringExtra("ans")

        images.setImageResource(im)

        for(i in 0 until ans!!.length)
        {
            val textView1 = TextView(this)

            textView1.textSize = 20f
            textView1.setBackgroundColor(Color.BLACK)
            val params = LinearLayout.LayoutParams(
                75,75
            )
            params.setMargins(5,10,5,10)
            textView1.setLayoutParams(params)
            textView1.setText(ans[i].toString().toUpperCase())
            textView1.setGravity(Gravity.CENTER_HORIZONTAL);
            textView1.setTextColor(resources.getColor(R.color.tcolor))
            textView1.typeface = font
            textView1.setBackgroundResource(R.drawable.textbackground)
            if(i<6)
            {
                top.addView(textView1)
            }
            else
            {
                botton.addView(textView1)
            }
        }

        for(i in 0 until 12)
        {
            val textView2 = TextView(this)
            val paramss = LinearLayout.LayoutParams(
                60,60
            )
            paramss.setMargins(5,10,5,10)

            textView2.textSize = 20f
            textView2.setBackgroundColor(Color.BLACK)
            textView2.setLayoutParams(paramss)
            textView2.setTextColor(resources.getColor(R.color.tcolor))
            textView2.setBackgroundResource(R.drawable.textviewbackground1)
            textView2.setGravity(Gravity.CENTER_HORIZONTAL);
            textView2.setTextColor(resources.getColor(R.color.tcolor))
            textView2.typeface = font
            if(i<6)
            {
                stop.addView(textView2)
            }
            else
            {
                sbotton.addView(textView2)
            }
            textView2.setOnClickListener {

            }
        }


    }



}