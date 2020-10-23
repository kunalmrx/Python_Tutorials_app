package com.example.pythontutorials

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TitleRecyclerAdapter(val context: Context, val titleList: List<Titles>): RecyclerView.Adapter<TitleRecyclerAdapter.TitleViewHolder>() {

    class TitleViewHolder(view:View):RecyclerView.ViewHolder(view)
    {
        var titletxt:TextView=view.findViewById(R.id.tvtitle)
        var llcontent:RelativeLayout=view.findViewById(R.id.rlcontent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_single_entry, parent, false)

        return TitleViewHolder(view)
    }

    override fun getItemCount(): Int {
         return titleList.size
    }

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int) {
   val titleclass =titleList[position]
        holder.titletxt.text=titleclass.title
        holder.llcontent.setOnClickListener()
        {
            val intent=Intent(context,SubTopicActivity::class.java)
            intent.putExtra("title",titleclass.title)
            intent.putExtra("id",titleclass.id)
            context.startActivity(intent)
        }

    }
}