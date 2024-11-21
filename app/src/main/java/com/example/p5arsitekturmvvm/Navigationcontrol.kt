package com.example.p5arsitekturmvvm

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p5arsitekturmvvm.model.JenisKelamin.jeniskelamin
import com.example.p5arsitekturmvvm.ui.view.FormulirView
import com.example.p5arsitekturmvvm.ui.view.TampilDataView
import com.example.p5arsitekturmvvm.viewmodel.SiswaViewModel

enum class Halaman {
    FORMULIR,
    TAMPILDATA
}
@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {
    val uiState by viewModel.statusUI.collectAsState()

    NavHost(
        modifier = modifier,
        navController = navHost,
        startDestination = Halaman.FORMULIR.name
    ) {

    }
}

