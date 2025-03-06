package com.syf.exercise.presentation

import androidx.lifecycle.ViewModel
import com.syf.exercise.data.CountryRepository

class CountriesViewModel(
    val countryRepository: CountryRepository = CountryRepository()
) : ViewModel() {



}