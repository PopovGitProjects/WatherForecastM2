package com.popov.watherforecastm2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.popov.watherforecastm2.R
import com.popov.watherforecastm2.ui.theme.CardBackground

@Preview(showBackground = true)
@Composable
fun Current() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(10.dp),
        backgroundColor = CardBackground,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "20 Jun 2022 13:00",
                    style = TextStyle(fontSize = 15.sp),
                )
                AsyncImage(
                    modifier = Modifier.size(56.dp),
                    model = "https://openweathermap.org/img/wn/10n@2x.png",
                    contentDescription = null,
                    placeholder = painterResource(id = R.drawable.img)
                )
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Location", fontSize = 22.sp)
                Text(text = "Current temp")
                Text(text = "Pressure")
                Text(text = "Wind dir")
                Text(text = "Wind speed")
                Text(text = "Max/Min temp")

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.refresh),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}