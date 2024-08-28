package com.example.todoapp.View

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lista.Model.Route
import com.example.lista.R
import com.example.lista.ui.theme.backg

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(nav: NavController) {

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
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
//        Image(painter = painterResource(id = R.drawable.logo) ,contentDescription = "Login image",
//            modifier = Modifier.size(150.dp))
                    Spacer(modifier = Modifier.height(420.dp))

                    Text(text = "Login", fontSize = 28.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))


                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(value = "", onValueChange = {

                    }, label = { Text("Email") })


                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(value = "", onValueChange = {
                    }, label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation()
                    )

                    Spacer(modifier = Modifier.height(8.dp))


                    Button(
                        colors =
                        ButtonDefaults.buttonColors(
                            containerColor = Color.Black,
                            contentColor = Color.White
                        ),
                        modifier = Modifier.size(100.dp, 50.dp),
                        onClick = { nav.navigate(Route.home) }) {
                        Text(text = "Login")
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    TextButton(
                        modifier = Modifier.size(200.dp, 40.dp),
                        onClick = {
                            Route.register

                        }) {
                        Text(text = "Register")
                    }


                    TextButton(
                        modifier = Modifier.size(300.dp, 80.dp),
                        onClick = {
                            nav.navigate(Route.forgetPassword)

                        }) {
                        Text(text = "Forget Password")

                    }

                }

            }
        }
    }
}

