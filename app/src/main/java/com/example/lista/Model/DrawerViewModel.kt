package com.example.lista.Model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel

class DrawerViewModel : ViewModel()
{
    data class DrawerNavItem (
    val title: String,
    val SelectedIcon : ImageVector,
    val unSelectedIcon : ImageVector,
    val BadgeCount : Int? = null
    )
}