package com.example.flagsandcountry.di

import com.example.flagsandcountry.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(application: App) {
    private var mApplication: App = application

    @Provides
    @Singleton
    fun providesApplication(): App {
        return mApplication
    }
}