package com.example.flagsandcountry.fragments

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.flagsandcountry.R
import com.example.flagsandcountry.views.CountriesListView

class CountriesListFragment : BaseFragment(), CountriesListView {

    private lateinit var countryList : RecyclerView

    override fun getLayoutId(): Int = R.layout.fragment_country_list

    override fun init() {
        super.init()
    }
}