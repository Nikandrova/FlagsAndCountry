package com.example.flagsandcountry.di

import com.example.flagsandcountry.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {
    fun inject(app: App)
}