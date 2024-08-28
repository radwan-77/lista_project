package com.example.lista.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.lista.R

@Composable
fun backg()
{

        Image(painter = painterResource(id = R.drawable.background),
            contentDescription =null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight()
        )}



