package com.example.pythontutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VideoPlayDescription : AppCompatActivity() {
    lateinit var playButton:Button
    lateinit var descriptionText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_play_description)

        val description:String=intent.getStringExtra("Description")
        val urlLink:String=intent.getStringExtra("Link")
        descriptionText=findViewById(R.id.descrip)
        playButton=findViewById(R.id.btnplay)
        descriptionText.text=description
        playButton.setOnClickListener()
        {
            val intent= Intent(this,VideoPlayerActivity::class.java)
            intent.putExtra("url",urlLink)
            startActivity(intent)
        }

    }
}