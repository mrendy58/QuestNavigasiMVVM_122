package com.example.p5arsitekturmvvm.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelpon by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama, gender, nim,email, alamat, notelpon)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text(text = "Nama") },
            placeholder = { Text(text = "Isi Nama Anda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        TextField(
            value = nim,
            onValueChange = { nim = it },
            label = { Text(text = "Nim") },
            placeholder = { Text(text = "Isi Nim Anda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Text(text = "Jenis Kelamin:")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        ) {
            listJK.forEach { genderOption ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    RadioButton(
                        selected = (genderOption == gender),
                        onClick = { gender = genderOption }
                    )
                    Text(text = genderOption, modifier = Modifier.padding(start = 4.dp))
                }
            }
        }

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email") },
            placeholder = { Text(text = "Isi Email Anda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        TextField(
            value = alamat,
            onValueChange = { alamat = it },
            label = { Text(text = "Alamat") },
            placeholder = { Text(text = "Isi Alamat Anda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        TextField(
            value = notelpon,
            onValueChange = { notelpon = it },
            label = { Text(text = "No Telepon") },
            placeholder = { Text(text = "Isi No Telepon Anda") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(onClick = {
            onSubmitClicked(listData)
        }) {
            Text(text = "Simpan")
        }
    }
}


