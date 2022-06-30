package com.example.fresher2022_kotlin_vinhcq1.ngay1

fun main(args: Array<String>) {
    for (i in 10 until 200) {
        if (i % 7 == 0 && i % 5 != 0) {
            print("$i, ")
        }
    }
}