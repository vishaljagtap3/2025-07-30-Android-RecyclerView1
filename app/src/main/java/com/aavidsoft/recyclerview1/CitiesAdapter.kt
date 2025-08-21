package com.aavidsoft.recyclerview1

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CitiesAdapter(
    private val cities : ArrayList<String>
) : RecyclerView.Adapter<CitiesAdapter.CityViewHolder>() {

    inner class CityViewHolder(
        val txtCityTitle : TextView
    ) : ViewHolder(txtCityTitle)

    override fun getItemCount() = cities.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val txtCityTitle = TextView(parent.context)
        txtCityTitle.layoutParams =
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        txtCityTitle.setPadding(32, 16, 32, 16)
        txtCityTitle.textSize = 40F

        /*txtCityTitle.setOnClickListener {
            Toast.makeText(parent.context, "City clicked...", Toast.LENGTH_LONG).show()
        }*/

        return CityViewHolder(txtCityTitle)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.txtCityTitle.text = cities[position]

        holder.txtCityTitle.setOnClickListener {
            Toast.makeText(holder.txtCityTitle.context, "${cities[position]} City clicked...", Toast.LENGTH_LONG).show()
        }
    }

}