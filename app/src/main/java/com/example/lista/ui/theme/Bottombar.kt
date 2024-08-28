package com.example.lista.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.lista.Model.BottomNavItem
import java.lang.reflect.Modifier
import java.nio.file.WatchEvent

@Composable
fun BottomBar(onItemSelected: (Int) -> Unit) {
    var selectedBottomBarIndex by rememberSaveable { mutableIntStateOf(0) }
    val itemsBottomBar = listOf(
        BottomNavItem("Home", Icons.Default.Home, Icons.Default.Home),
        BottomNavItem("pomodoro", Icons.Default.Person, Icons.Default.Person),
        BottomNavItem("Calender", Icons.Default.Person, Icons.Default.DateRange),
        BottomNavItem("Profile", Icons.Default.Settings, Icons.Default.Person)
    )

    NavigationBar {
        itemsBottomBar.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedBottomBarIndex == index,
                onClick = {
                    selectedBottomBarIndex = index
                    onItemSelected(index)  // Invoke the callback
                },
                label = { Text(text = item.title) },
                alwaysShowLabel = true,
                icon = {
                    Icon(
                        imageVector = if (selectedBottomBarIndex == index) {
                            item.selected
                        } else {
                            item.unselectedIcon
                        },
                        contentDescription = item.title,
                    )
                }
            )
        }
    }
}
