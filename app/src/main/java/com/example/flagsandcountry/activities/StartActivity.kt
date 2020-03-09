package com.example.flagsandcountry.activities

import android.os.Bundle
import com.example.flagsandcountry.R
import com.example.flagsandcountry.fragments.StartFragment

class StartActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_base

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showFragment(StartFragment(), false)
    }
}
