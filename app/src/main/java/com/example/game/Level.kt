package com.example.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class Level : AppCompatActivity() {

    lateinit var re: RecyclerView
    var img = arrayOf(
        R.drawable.twitter,
        R.drawable.nike,
        R.drawable.netflix,
        R.drawable.facebook,
        R.drawable.mcdonalds,
        R.drawable.shopping,
        R.drawable.adidas,
        R.drawable.whatsapp,
        R.drawable.telegram,
        R.drawable.instagram,
        R.drawable.tiktok,
        R.drawable.youtube,
        R.drawable.monster,
        R.drawable.mercedess,
        R.drawable.starbucks,
        R.drawable.android,
        R.drawable.linkedin,
        R.drawable.shopify,
        R.drawable.photoshop,
        R.drawable.chrome,
        R.drawable.mail,
        R.drawable.google,
        R.drawable.snapchat,
        R.drawable.windows
    )

    var ans = arrayOf("twitter", "nike", "netflix", "facebook", "mcdonald's", "amazon","adidas","whatsapp","telegram","instagram","tiktok","youtube","monster","mercedes","starbucks","android","linkdin","spotify","photoshop","chrome","email","google","snapchat","window")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        re = findViewById(R.id.re)

        var adapter = ShowLevel(this, img,ans)
        re.adapter = adapter

    }
}