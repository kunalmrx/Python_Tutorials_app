package com.example.pythontutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class VideoPlayerActivity : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        val urlLink:String=intent.getStringExtra("url")
        webView=findViewById(R.id.youtube)
        webView.loadUrl(urlLink)


    }

    override fun onPause() {
        super.onPause()
        super.onBackPressed()
    }
}