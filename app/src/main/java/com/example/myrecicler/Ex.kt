package com.example.myrecicler

import layout.Nota

fun lista() : Array<Nota> {
    val arraySemplice = arrayOf<Nota>(
        Nota("titolo1","data1", "anteprima1"),
        Nota("titolo2","data2", "anteprima2"),
        Nota("titolo3","data3", "anteprima3"))
    return arraySemplice
}