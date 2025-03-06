package com.syf.exercise.data

import com.syf.exercise.getStringOrNull
import org.json.JSONArray

class CountryRepository {
    private val api = CountryApi()

    suspend fun getCountries(): List<Country> {
        val countriesJsonString = api.fetchCountries()

        val countryList = mutableListOf<Country>()

        val jsonArray = JSONArray(countriesJsonString)

        for (i in 0 until jsonArray.length()) {
            val jsonObject = jsonArray.getJSONObject(i)
            val name = jsonObject.getStringOrNull("name")!!
            val continent = jsonObject.getStringOrNull("continent")!!
            val flagImageUrl = jsonObject.getStringOrNull("flagImageUrl")!!

            val country = Country(
                name = name,
                continent = continent,
                flagImageUrl = flagImageUrl
            )
            countryList.add(country)
        }

        return countryList
    }
}