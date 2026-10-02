package com.example.basiclayoutkotlin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip


@Composable
fun LoginPage(modifier: Modifier) {
    val background = painterResource(id = R.drawable.newbg)
    val logo = painterResource(id = R.drawable.newlogo)
    val profpic = painterResource(id = R.drawable.newpic)

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
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 30.sp,
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login.",
                fontSize = 15.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(15.dp))

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Nama",
                fontSize = 15.sp,
                color = Color.Cyan,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Farhan Rasyid Mustaqim",
                fontSize = 20.sp,
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "20240140102",
                fontSize = 25.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Image(
                painter = profpic,
                contentDescription = null,
                modifier = Modifier
                    .height(250.dp)
                    .width(250.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }

}