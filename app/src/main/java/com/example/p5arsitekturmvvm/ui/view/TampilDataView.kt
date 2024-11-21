package com.example.p5arsitekturmvvm.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button // Import Button from Material3
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.p5arsitekturmvvm.model.DataSiswa

@Composable
fun TampilDataView(
    modifier: Modifier = Modifier,
    uiState: DataSiswa,
    onBackButton: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Display the data fields
        TampilData(param = "Nama", argu = uiState.nama)
        TampilData(param = "Jenis-Kelamin", argu = uiState.gender)
        TampilData(param = "Nim", argu = uiState.nim)
        TampilData(param = "Alamat", argu = uiState.alamat)
        TampilData(param = "Email", argu = uiState.email)
        TampilData(param = "No Telepon", argu = uiState.notelpon)

        // Button "Kembali" di tengah
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = onBackButton) {
                Text(text = "Kembali")
            }
        }
    }
}

@Composable
fun TampilData(
    param: String,
    argu: String
) {

}

