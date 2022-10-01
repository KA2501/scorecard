package com.example.scorecard

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.scorecard.ui.theme.ScoreCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoreCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                ScoreCard()
                }
            }
        }
    }
}

@Composable
fun ScoreCard() {
    Image(
        painter = painterResource(id = com.example.scorecard.R.drawable.compose), contentDescription = "image",
        modifier = Modifier
            .fillMaxWidth(),
        contentScale = ContentScale.FillBounds,


        )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScoreCardTheme {
        ScoreCard()
    }
}