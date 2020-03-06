package com.example.flagsandcountry.activities

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.flagsandcountry.R
import com.example.flagsandcountry.fragments.CountriesListFragment
import com.example.flagsandcountry.views.StartView
import com.jakewharton.rxbinding3.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity(), StartView {
    private val internetPermission: String = android.Manifest.permission.INTERNET
    private val REQUEST_CODE = 101

    private lateinit var tvInternetStatus: TextView
    private lateinit var showCountryList: Observable<Unit>
    private lateinit var containerLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        containerLayout = container.add(R.layout.activity_start)


        showCountryList = btnCountryList.clicks().map { showCountriesList()}
    }

    private fun checkPermission(): Boolean = if (ActivityCompat.checkSelfPermission(
            applicationContext, internetPermission) == PackageManager.PERMISSION_GRANTED) {
        true
    } else {
        ActivityCompat.requestPermissions(this, arrayOf(internetPermission), REQUEST_CODE)
        false
    }

    override fun checkPermissionIntenet() {

    }

    override fun checkLoadCountriesInfo() {

    }

    override fun loadCountries() {

    }

    override fun showCountriesList() {
        showFragment(CountriesListFragment(), true)
    }

    fun showFragment(fragment: Fragment, addToBack: Boolean = false, containerId: Int = R.id.container) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        transaction.replace(containerId, fragment, fragment.javaClass.simpleName)
        if (addToBack) transaction.addToBackStack(null)
        transaction.commitAllowingStateLoss()
    }

}
