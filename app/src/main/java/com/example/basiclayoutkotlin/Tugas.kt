package com.example.basiclayoutkotlin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun LoginPage(modifier: Modifier) {
    val background = painterResource(id = R.drawable.background)
    val logo = painterResource(id = R.drawable.logo)
    val profpic = painterResource(id = R.drawable.profpic)

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 30.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login.",
                fontSize = 10.sp,
                color = Color.White
            )

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier.height(150.dp)
            )

            Text(
                text = "Nama",
                fontSize = 12.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Farhan Rasyid Mustaqim",
                fontSize = 15.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "20240140102",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )


}