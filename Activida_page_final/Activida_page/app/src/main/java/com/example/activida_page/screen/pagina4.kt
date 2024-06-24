package com.example.activida_page.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.activida_page.R
import com.example.activida_page.ui.theme.beish
import com.example.activida_page.ui.theme.vinotinto

@Composable
fun Pagina4(navController: NavHostController) {
    val imageList = listOf(
        R.drawable.campo,
        R.drawable.campo2,
        R.drawable.campo3,
        R.drawable.campo4
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = beish)
    ) {
        item {
            Column(
                modifier = Modifier

                    .fillMaxWidth()
            ) {
                // Primer conjunto de LazyRows
                LazyRow(modifier = Modifier.fillMaxWidth().background(vinotinto)) {
                    items(10) { index ->
                        Text(
                            text = "Opcion $index",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    items(imageList) { imageRes ->
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = null,
                            modifier = Modifier
                                .size(300.dp)
                                .padding(8.dp)
                        )
                    }
                }
            }
        }

        // LazyColumn
        items(20) { index ->
            if (index % 2 == 0) {
                Text(
                    text = "Elemento $index",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.campo),
                    contentDescription = "Imagen $index",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(8.dp)
                )
            }
        }
    }
}





@Composable
fun Imagen4(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = contentScale
    )
}

