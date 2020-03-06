package com.example.flagsandcountry

import android.app.Application
import com.example.flagsandcountry.di.AppComponent
import com.example.flagsandcountry.di.DaggerAppComponent

public object App: Application() {
    lateinit var app: App
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        app = this
        initAppComponent()
        component.inject(this)
    }

    fun getAppComponent(): AppComponent? {
        return component
    }

    private fun initAppComponent() {
        component = DaggerAppComponent.builder()
            .build()
    }
}