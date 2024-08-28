package com.example.lista.Screens



import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch
import androidx.compose.material3.Text as Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.navigation.NavController
import com.example.lista.Model.BottomNavItem
import com.example.lista.Model.DrawerViewModel
import com.example.lista.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(nav: NavController, viewModel: DrawerViewModel = viewModel())
{


// important variable to declare

    // bottom bar
    var selectedBottomBarIndex by rememberSaveable { mutableIntStateOf(0) }
    val itemsBottomBar = listOf(
            BottomNavItem("Home", Icons.Default.Home, Icons.Default.Home,),
            BottomNavItem("Profile", Icons.Default.Person, Icons.Default.Person,),
            BottomNavItem("Settings", Icons.Default.Settings, Icons.Default.Settings,),
        )
    // DrawerViewModel instance
    var selectedDrawerIndex by rememberSaveable { mutableIntStateOf(0) }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val itemsDrawerBar = listOf(
        DrawerViewModel.DrawerNavItem("Home", Icons.Default.Menu, Icons.Default.Menu),
        DrawerViewModel.DrawerNavItem("Pomodoro", Icons.Default.Menu, Icons.Default.Menu),
        DrawerViewModel.DrawerNavItem("Profile", Icons.Default.Menu, Icons.Default.Menu)
    )
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    Spacer(modifier = Modifier.height(12.dp))
                    itemsDrawerBar.forEachIndexed { index, item ->
                        NavigationDrawerItem(
                            label = { Text(text = item.title) },
                            selected = index == selectedDrawerIndex,
                            onClick = {
                                selectedDrawerIndex = index
                                scope.launch {
                                    drawerState.close()
                                // Close drawer after selection
                                }
                                // Navigate to the corresponding screen
                                when (index) {
                                    0 -> nav.navigate("home")
                                    1 -> nav.navigate("pomodoro")
                                    2 -> nav.navigate("profile")
                                }
                            },
                            icon = {
                                Icon(
                                    imageVector = if (index == selectedDrawerIndex) {
                                        item.SelectedIcon
                                    } else {
                                        item.unSelectedIcon
                                    },
                                    contentDescription = item.title
                                )
                            },
                            badge = {
                                if (item.BadgeCount != null) Text(text = item.BadgeCount.toString())
                            },
                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                        )
                    }
                }
            }
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        colors = TopAppBarDefaults.largeTopAppBarColors(
                            containerColor = Color.Transparent,
                            titleContentColor = Color.Black,
                        ),
                        title = { Text("To-Do List") },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    scope.launch { drawerState.open() }
                                },
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "Menu",
                                )
                            }
                        },
                    )
                }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it),
                    verticalArrangement = Arrangement.Center,
                ){
                    Text(text = "kjdxhkfsd")
                }
            }
        }
    }


}

