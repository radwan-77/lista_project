package com.example.lista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lista.Model.Route
import com.example.lista.Screens.EmailScreen
import com.example.lista.Screens.ForgetScreen
import com.example.lista.Screens.HomeScreen
import com.example.lista.ui.theme.ListaTheme
import com.example.lista.ui.theme.backg
import com.example.todoapp.View.LoginScreen
import com.example.todoapp.View.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            backg()
            ListaTheme {
                val nav = rememberNavController()
                NavHost(navController = nav, startDestination = Route.login, builder = {
                    composable(Route.login) {
                        LoginScreen(nav)
                    }
                    composable(Route.home)
                    {
                        HomeScreen(nav)
                    }
                    composable(Route.register)
                    {
                        RegisterScreen(nav)
                    }
                    composable(Route.forgetPassword)
                    {
                        ForgetScreen(nav)
                    }
                    composable(Route.emailVerification)
                    {
                        EmailScreen(nav)
                    }
               }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListaTheme{
        var nav = rememberNavController()
        RegisterScreen(nav)
    }
}




