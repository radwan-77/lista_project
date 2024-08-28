package com.example.lista.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lista.Model.Route
import com.example.lista.R
import com.example.lista.ui.theme.backg

@Composable
fun WelcomeScreen(nav: NavController) {
//    backg()
    MaterialTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
        ) { p ->
            println(p)
            Box {
                Image(
                    painter = painterResource(R.drawable.background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .aspectRatio(0.45f)
                )
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Spacer(modifier = Modifier.height(450.dp))
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Login image",
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Welcome to Lista", color = Color.Black,
                    style = MaterialTheme.typography.headlineLarge,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))

//                Spacer(modifier = Modifier.height(550.dp))
                Button(
                    colors =
                    ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.size(100.dp, 50.dp),
                    onClick = { nav.navigate(Route.login) }) {
                    Text(text = "Login")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    colors =
                    ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    modifier = Modifier.size(100.dp, 50.dp),
                    onClick = { nav.navigate(Route.register) }) {
                    Text(text = "register")
                }
                TextButton(onClick = {}, modifier = Modifier.size(200.dp, 50.dp)) {

                }
            }
        }
    }
}

