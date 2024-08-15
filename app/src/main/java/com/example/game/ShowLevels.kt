package com.example.game

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ShowLevels(var showAllLevel: ShowAllLevel) : RecyclerView.Adapter<ShowLevels.MyClass>() {
    class MyClass(itemView: View) : ViewHolder(itemView){
        var level:ImageView
        var txtlevel:TextView
        init {
            level=itemView.findViewById(R.id.level)
            txtlevel=itemView.findViewById(R.id.txtlevel)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyClass {
        var vv=LayoutInflater.from(showAllLevel).inflate(R.layout.xyz,parent,false)
        return MyClass(vv)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: MyClass, position: Int) {
        holder.txtlevel.setText("Level ${position+1}")

       holder.level.setOnClickListener {
           var i=Intent(showAllLevel,Level::class.java)
           i.putExtra("levelname",position+1)
           showAllLevel.startActivity(i)
       }
    }

}
