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
fun LoginScreen(nav: NavController) {


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
        Image(painter = painterResource(id = R.drawable.background) ,contentDescription = "Login image",
            modifier = Modifier.size(200.dp))
        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Login to your account")




        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value ="",onValueChange ={

        }, label = { Text("Email")})


        Spacer(modifier = Modifier.height(16.dp))



        OutlinedTextField(value = "",onValueChange ={
        }, label = { Text("Password")},
            visualTransformation = PasswordVisualTransformation())




        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {
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


        Spacer(modifier = Modifier.height(32.dp))


    }

}


