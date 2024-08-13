package com.example.game

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class ShowAllLevel : AppCompatActivity() {

    lateinit var re:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_level)

        re=findViewById(R.id.re)

        var adapter=ShowLevels(this@ShowAllLevel)
        re.adapter=adapter
    }
}