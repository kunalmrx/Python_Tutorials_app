package com.example.pythontutorials

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class WelcomeActivity : AppCompatActivity() {
    lateinit var userName:EditText
    lateinit var sharedPreferences: SharedPreferences
    lateinit var proceed:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        userName=findViewById(R.id.username)
        proceed=findViewById(R.id.proceed)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        if(isLoggedIn)
        {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }



        proceed.setOnClickListener(){
            val name:String=userName.text.toString()

            if(name.isEmpty())
            {
                userName.setError("Please Enter your name")
                userName.requestFocus()
            }
            else{
                savePrefrences()
                val intent=Intent(this,HomeActivity::class.java)
                sharedPreferences.edit().putString("Name", name).apply()
                print("welcomeactivity"+name)
                startActivity(intent)
            }
        }

    }
    fun savePrefrences() {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()


    }
}