package com.example.p5arsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.p5arsitekturmvvm.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    //request
    private val _statusUI = MutableStateFlow(DataSiswa())
    //response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update {statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                nim = ls[2],
                email = ls[3],
                alamat = ls[4],
                notelpon = ls[5]
            )
        }
    }
}