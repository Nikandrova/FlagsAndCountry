package com.example.flagsandcountry.models

data class Country (
    val name: String,
    val capital: String,
    val region: String,
    val subregion: String,
    val population: String,
    val latlng: List<Int>,
    val area: Int,
    val gini: Int,
    val timezones: List<String>,
    val nativeName: String,
    val numericCode: String,
    val languages: List<Language>,
    val flag: String
    )