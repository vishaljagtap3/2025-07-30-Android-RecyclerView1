package com.aavidsoft.recyclerview1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewCities : RecyclerView
    private val cities = ArrayList<String>()
    private lateinit var citiesAdapter: CitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData();
        initViews()
    }

    private fun initData() {
        for(i in 0..10) {
            cities.add("Pune-$i")
            cities.add("Mumbai-$i")
            cities.add("Nagpur-$i")
            cities.add("Chennai-$i")
            cities.add("Delhi-$i")
            cities.add("Jaipur-$i")
            cities.add("Kolkata-$i")
            cities.add("Bhopal-$i")
            cities.add("Bengaluru-$i")
            cities.add("Kolhapur-$i")
            cities.add("Nashik-$i")
            cities.add("Yavatmal-$i")
        }
    }

    private fun initViews() {
        recyclerViewCities = findViewById(R.id.recyclerCities)
        recyclerViewCities.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        citiesAdapter = CitiesAdapter(cities)
        recyclerViewCities.adapter = citiesAdapter
    }
}