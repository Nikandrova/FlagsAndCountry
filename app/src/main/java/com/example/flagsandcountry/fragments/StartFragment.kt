package com.example.flagsandcountry.fragments

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.example.flagsandcountry.ClickEvent
import com.example.flagsandcountry.R
import com.example.flagsandcountry.views.StartView
import com.jakewharton.rxbinding3.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : BaseFragment(), StartView {
    private val internetPermission: String = android.Manifest.permission.INTERNET
    private val REQUEST_CODE = 101

    private lateinit var tvInternetStatus: TextView
    private lateinit var showCountryList: Observable<Unit>

    override fun getLayoutId(): Int = R.layout.fragment_start

    override fun init() {
        super.init()
        showCountryList = btnCountryList.clicks().map {  showCountriesList()}
    }

    override fun checkPermissionIntenet() {

    }

    override fun checkLoadCountriesInfo() {

    }

    override fun loadCountries() {

    }

    override fun showCountriesList(){
        getBaseActivity().showFragment(CountriesListFragment(), false)
    }

    private fun checkPermission(): Boolean = if (ActivityCompat.checkSelfPermission(
            context!!, internetPermission
        ) == PackageManager.PERMISSION_GRANTED
    ) {
        true
    } else {
        requestPermissions(arrayOf(internetPermission), REQUEST_CODE)
        false
    }
}