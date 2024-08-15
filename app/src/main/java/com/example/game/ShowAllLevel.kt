package com.example.game

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class ShowAllLevel : AppCompatActivity() {

    lateinit var re:RecyclerView
    lateinit var sbtn: AppCompatButton
    lateinit var cbtn: AppCompatButton

    companion object{
        lateinit var sp:SharedPreferences
        lateinit var edit:SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_level)

        re=findViewById(R.id.re)
        cbtn=findViewById(R.id.cbtn)
        sbtn=findViewById(R.id.sbtn)

        sp=getSharedPreferences("keys",0)
        edit=sp.edit()

        var addpoints=sp.getInt("addpoints",0)
        var addcoins=sp.getInt("addcoins",50)


        sbtn.setText(addpoints.toString())
        cbtn.setText(addcoins.toString())

        var adapter=ShowLevels(this@ShowAllLevel)
        re.adapter=adapter





    }
}