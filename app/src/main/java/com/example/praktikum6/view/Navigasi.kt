package com.example.praktikum6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum6.view.FormIsian
import com.example.praktikum6.view.TampilData

// Enum untuk mendefinisikan rute navigasi aplikasi
enum class Navigasi {
    FormulirSaya,
    Detail
}

