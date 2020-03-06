package com.example.flagsandcountry.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface StartView : MvpView{
    fun checkPermissionIntenet()
    fun checkLoadCountriesInfo()
    fun loadCountries()
    fun showCountriesList()
}