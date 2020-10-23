package com.example.pythontutorials

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.concurrent.fixedRateTimer


class HomeFragment : Fragment() {
    lateinit var recyclerFavourite: RecyclerView


    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: TitleRecyclerAdapter
    lateinit var etsearch:EditText
    lateinit var btnSearch:Button
    lateinit var searchtag:String
    lateinit var userText:TextView
    var titleList = arrayListOf<Titles>()

    lateinit var sharedPreferences:SharedPreferences



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        sharedPreferences = activity!!.getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val username=sharedPreferences.getString("Name","")


        userText=view.findViewById(R.id.hellomessage)
        recyclerFavourite = view.findViewById(R.id.recyclerHome)
        etsearch=view.findViewById(R.id.etsearch)
        btnSearch=view.findViewById(R.id.btnsearch)

        layoutManager = GridLayoutManager(activity as Context, 1)


        titleList.add(Titles("1","Introduction"))
        titleList.add(Titles("2","Flow Control"))
        titleList.add(Titles("3","Functions"))
        titleList.add(Titles("4","Data Types"))
        titleList.add(Titles("5","File Handling"))
        titleList.add(Titles("6","Objects and Classes"))
        titleList.add(Titles("7","Advanced Tutorials"))
        titleList.add(Titles("8","Date and Time"))
        titleList.add(Titles("9","About Python Programming"))
        titleList.add(Titles("10","Why Learn Python?"))
        titleList.add(Titles("11","How to Learn Python?"))
        titleList.add(Titles("12","Python Resources"))
        recyclerAdapter = TitleRecyclerAdapter(activity as Context, titleList)
        recyclerFavourite.adapter = recyclerAdapter
        recyclerFavourite.layoutManager = layoutManager




     btnSearch.setOnClickListener()
     {
         var titleListaftersearch = arrayListOf<Titles>()
         var i =0
         var j=0
         print("hello"+titleList)
       while (i in  0 until 12)
       {
           if (titleList[i].title.contains(etsearch.text,ignoreCase = true))
           {
               titleListaftersearch.add(titleList[i])
               j++
           }

           i++
       }
         if(j>0)
         {
             recyclerAdapter = TitleRecyclerAdapter(activity as Context, titleListaftersearch)
             recyclerFavourite.adapter = recyclerAdapter
             recyclerFavourite.layoutManager = layoutManager
         }

         else {


               Toast.makeText(context,"No such File found",Toast.LENGTH_LONG).show()
         }

         }

        userText.setText("Hey "+username+",")
        return view
    }

}