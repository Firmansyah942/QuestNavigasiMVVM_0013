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

// Fungsi utama Navigasi menggunakan NavHost
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            // Halaman Form Isian (Awal)
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    onSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            // Halaman Tampil Data (Detail)
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
                )
            }
        }
    }
}

// Fungsi bantu untuk kembali ke halaman formulir
private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
) {
    navController.popBackStack(route = Navigasi.FormulirSaya.name, inclusive = false)
}