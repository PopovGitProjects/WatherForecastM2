package com.popov.watherforecastm2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.popov.watherforecastm2.R
import com.popov.watherforecastm2.ui.theme.CardBackground

@Preview(showBackground = true)
@Composable
fun Item() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp),
        elevation = 8.dp,
        shape = RoundedCornerShape(10.dp),
        backgroundColor = CardBackground
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(start = 5.dp, top = 5.dp, bottom = 5.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "13:00")
                Text(text = "Sunny")
            }
            Text(text = "25/13")
            AsyncImage( modifier = Modifier.padding(end = 5.dp),
                model = "https://openweathermap.org/img/wn/10d@2x.png",
                contentDescription = null,
                placeholder = painterResource(id = R.drawable.img)
            )
        }
    }
}