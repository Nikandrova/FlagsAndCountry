package com.example.flagsandcountry.api

import retrofit2.Retrofit

class CountryApi(retrofit: Retrofit) {
    private var countriesApi: CountryRetrofitApi =
        retrofit.create<CountryRetrofitApi>(CountryRetrofitApi::class.java)

    fun provide(): CountryRetrofitApi {
        return countriesApi
    }
}