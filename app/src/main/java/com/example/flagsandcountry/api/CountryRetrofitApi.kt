package com.example.flagsandcountry.api

import com.example.flagsandcountry.models.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryRetrofitApi {
    @GET("all?fields=name;capital;region;subregion;population;latlng;area;gini;timezones;nativeName;numericCode;languages;flag")
    fun getCountries(): Single<List<Country>>
}