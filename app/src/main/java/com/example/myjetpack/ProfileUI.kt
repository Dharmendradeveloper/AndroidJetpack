package com.example.myjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ProfileUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    private fun MainScreen() {
        Surface(modifier = Modifier.fillMaxSize()) {
            CountryCard()
        }
    }

    @Composable
    private fun CountryCard() {
        Surface(
            modifier = Modifier
                .fillMaxWidth(1f)
                .wrapContentHeight(align = Alignment.Top)
                .padding(5.dp)
                .border(width = 1.dp, color = Color.LightGray),
            shadowElevation = 20.dp
        ) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.2f)
                        .weight(0.2f)
                        .border(width = 2.dp, color = Color.Red)
                ) {
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .height(80.dp)
                            .padding(5.dp)
                    ) {
                        val imageResId = R.drawable.ic_launcher_background
                        val painter = painterResource(id = imageResId)
                        Image(
                            painter = painter,
                            contentDescription = "Android icon",
                            contentScale = ContentScale.Crop
                        )

                    }
                    Text(
                        text = "Android",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(2.dp),
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Google, USA",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(2.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Column(modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .weight(0.8f)) {
                    Text(
                        text = "Android",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(2.dp),
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Google, USA",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(2.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Canada",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .padding(2.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center
                    )

                    Row(modifier = Modifier.fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceEvenly) {
                        Text(
                            text = "$",
                            modifier = Modifier
                                .fillMaxWidth(0.1f)
                                .padding(2.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = "Google, USA",
                            modifier = Modifier
                                .fillMaxWidth(0.4f)
                                .padding(2.dp),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        )

                        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
                            Text(
                                text = "+91",
                                modifier = Modifier
                                    .fillMaxWidth(1f)
                                    .padding(2.dp),
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                            Text(
                                text = "Ind",
                                modifier = Modifier
                                    .fillMaxWidth(1f)
                                    .padding(2.dp),
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }


    @Composable
    @Preview(showBackground = true)
    fun DefaultPreview() {
        MainScreen()
    }
}