package com.syf.exercise.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.syf.exercise.data.Country

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountriesScreen(viewModel: CountriesViewModel = viewModel()) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Countries") },
            )
        },
        containerColor = Color.White
    ) { paddingValues ->
        Box(Modifier.padding(paddingValues)) {
            CountryList()
        }
    }
}

@Composable
fun CountryList() {
    Text("Replace this text with list of countries")
}

@Composable
fun CountryItem(country: Country) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(context = LocalContext.current)
            .data(country.flagImageUrl)
            .decoderFactory(SvgDecoder.Factory())
            .placeholder(android.R.drawable.ic_menu_gallery)
            .build()
    )
    Image(modifier = Modifier.size(40.dp), painter = painter, contentDescription = null)
}

@Preview
@Composable
fun CountryListPreview() {
    Box(Modifier.fillMaxSize()) {
        CountriesScreen()
    }
}

@Preview(device = "spec:width=1080px,height=2340px,dpi=440", showBackground = true)
@Composable
fun CountryItemPreview() {
    CountryItem(
        Country(
            name = "Canada",
            continent = "North America",
            flagImageUrl = ""
        )
    )
}