package com.example.todoapp.View

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lista.R
import com.example.lista.ui.theme.backg

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(nav: NavController) {


//    var email by remember {
//        mutableStateOf("")
//    }
//    var password by remember {
//        mutableStateOf("")
//    }



    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(painter = painterResource(id = R.drawable.logo) ,contentDescription = "Login image",
            modifier = Modifier.size(150.dp))
        Spacer(modifier = Modifier.height(250.dp))

        Text(text = "Register", fontSize = 28.sp, fontWeight = FontWeight.Bold )
        Spacer(modifier = Modifier.height(4.dp))




        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value ="",onValueChange ={

        }, label = { Text("Email")})


        Spacer(modifier = Modifier.height(16.dp))



        OutlinedTextField(value = "",onValueChange ={
        }, label = { Text("Password")},
            visualTransformation = PasswordVisualTransformation())




        Spacer(modifier = Modifier.height(16.dp))



        Button(
            colors =
                ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            modifier = Modifier.size(200.dp, 50.dp),
            onClick = {
            when {
//                email.isEmpty() -> {
//                    Toast.makeText(context, "Username cannot be empty", Toast.LENGTH_SHORT).show()
//                }
//                password.length < 8 -> {
//                    Toast.makeText(context, "Password must be at least 8 characters long", Toast.LENGTH_SHORT).show()
//                }
//                else -> {
//                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
//                    nav.navigate(Route.Home + "/$email" + "/$password")
//                    // Proceed with login logic
//                }
            }
        }) {
            Text(text = "Register")
        }


        Spacer(modifier = Modifier.height(16.dp))



        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            modifier = Modifier.size(200.dp, 50.dp),
            onClick = {
                when {
//                email.isEmpty() -> {
//                    Toast.makeText(context, "Username cannot be empty", Toast.LENGTH_SHORT).show()
//                }
//                password.length < 8 -> {
//                    Toast.makeText(context, "Password must be at least 8 characters long", Toast.LENGTH_SHORT).show()
//                }
//                else -> {
//                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
//                    nav.navigate(Route.Home + "/$email" + "/$password")
//                    // Proceed with login logic
//                }
                }
            }) {
            Text(text = "Login")
        }



    }

}


