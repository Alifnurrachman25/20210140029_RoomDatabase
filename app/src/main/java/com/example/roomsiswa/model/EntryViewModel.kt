package com.example.roomsiswa.model



data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
)

data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telepon: String = "",
)