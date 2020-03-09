package com.example.flagsandcountry.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flagsandcountry.R
import kotlinx.android.synthetic.main.country_list_item.view.*

class CountriesAdapter : RecyclerView.Adapter<CountryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

abstract class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var countryName: TextView = view.findViewById(R.id.tvCountryName)
    private var countryFlag: ImageView = view.findViewById(R.id.ivFlag)
}