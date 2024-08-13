package com.example.game

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ShowLevel(var level: Level, var img: Array<Int>, var ans: Array<String>) : RecyclerView.Adapter<ShowLevel.MyClass>() {
    class MyClass(itemView: View) : ViewHolder(itemView) {
        var images:ImageView
        init {
            images=itemView.findViewById(R.id.images)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyClass {
        var vv=LayoutInflater.from(level).inflate(R.layout.abc,parent,false)
        return MyClass(vv)
    }

    override fun getItemCount(): Int {
        return img.size
    }

    override fun onBindViewHolder(holder: MyClass, position: Int) {
        holder.images.setBackgroundResource(img[position])

        holder.images.setOnClickListener {
            var i=Intent(level,ShowImage::class.java)
            i.putExtra("img",img[position])
            i.putExtra("ans",ans[position])
            level.startActivity(i)
        }
    }

}
