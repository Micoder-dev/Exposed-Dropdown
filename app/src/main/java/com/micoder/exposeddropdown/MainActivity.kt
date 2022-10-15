package com.micoder.exposeddropdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var til_season: TextInputLayout
    lateinit var act_seasons: AutoCompleteTextView

    var arrayList_season: ArrayList<String>? = null
    var arrayAdapter_season: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        til_season = findViewById(R.id.til_season)
        act_seasons = findViewById(R.id.act_season)

        arrayList_season = ArrayList()
        arrayList_season!!.add("Winter")
        arrayList_season!!.add("Spring")
        arrayList_season!!.add("Summer")
        arrayList_season!!.add("Monsoon")
        arrayList_season!!.add("Autumn")

        arrayAdapter_season = ArrayAdapter(applicationContext, R.layout.tv_entity, arrayList_season!!)
        act_seasons.setAdapter(arrayAdapter_season)
        act_seasons.threshold = 1 // suggestions will display according to the characters entered



    }
}