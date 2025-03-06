package com.syf.exercise.data

import kotlinx.coroutines.delay

private const val countryList = """
[
  {
    "name": "United States",
    "continent": "North America",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/a/a4/Flag_of_the_United_States.svg",
    "description": "The United States is a large country in North America known for its global influence on culture, politics, and economics."
  },
  {
    "name": "China",
    "continent": "Asia",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/commons/f/fa/Flag_of_the_People%27s_Republic_of_China.svg",
    "description": "China is the most populous country in the world, with a rich history and a rapidly growing economy."
  },
  {
    "name": "India",
    "continent": "Asia",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/4/41/Flag_of_India.svg",
    "description": "India is a diverse South Asian country known for its rich cultural heritage and is the world's largest democracy."
  },
  {
    "name": "United Kingdom",
    "continent": "Europe",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/a/ae/Flag_of_the_United_Kingdom.svg",
    "description": null
  },
  {
    "name": "France",
    "continent": "Europe",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/c/c3/Flag_of_France.svg",
    "description": "France is a European country famous for its art, gastronomy, and iconic landmarks like the Eiffel Tower."
  },
  {
    "name": "Germany",
    "continent": "Europe",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/b/ba/Flag_of_Germany.svg",
    "description": "Germany is a European country known for its engineering excellence and influential role in the European Union."
  },
  {
    "name": "Japan",
    "continent": "Asia",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/9/9e/Flag_of_Japan.svg",
    "description": "Japan is an East Asian island nation known for its blend of traditional culture and advanced technology."
  },
  {
    "name": "Australia",
    "continent": "Oceania",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/b/b9/Flag_of_Australia.svg",
    "description": "Australia is a country and continent known for its unique wildlife and natural landscapes."
  },
  {
    "name": "Brazil",
    "continent": "South America",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/en/0/05/Flag_of_Brazil.svg",
    "description": "Brazil is the largest country in South America, famous for its Amazon rainforest and vibrant culture."
  },
  {
    "name": "Canada",
    "continent": "North America",
    "flagImageUrl": "https://upload.wikimedia.org/wikipedia/commons/c/cf/Flag_of_Canada.svg",
    "description": "Canada is a vast North American country known for its natural beauty and multicultural cities."
  }
]
"""

class CountryApi {
    suspend fun fetchCountries(): String {
        delay(2000)
        return countryList.trimIndent()
    }
}