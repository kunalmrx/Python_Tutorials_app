package com.example.pythontutorials

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VideoLinkRecyclerAdapter(val context: Context, val videoList: List<VideoLinkDes>) :


    RecyclerView.Adapter<VideoLinkRecyclerAdapter.VideoViewHolder>() {

    class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var titletxt: TextView = view.findViewById(R.id.tvtitle)
        var llcontent: RelativeLayout = view.findViewById(R.id.rlcontent)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoLinkRecyclerAdapter.VideoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_single_entry, parent, false)

        return VideoViewHolder(view)
    }

    override fun getItemCount(): Int {
      return videoList.size

    }

    override fun onBindViewHolder(holder: VideoLinkRecyclerAdapter.VideoViewHolder, position: Int) {
       val videoDes=videoList[position]
        holder.titletxt.text=videoDes.titlename
        holder.llcontent.setOnClickListener()
        {
            val intent=Intent(context,VideoPlayDescription::class.java)
            intent.putExtra("Description",videoDes.decscription)
            intent.putExtra("Link",videoDes.videolink)
            context.startActivity(intent)


        }
    }


}

