package com.example.fresher2022_kotlin_vinhcq1.ngay5

fun main(args: Array<String>) {
    val arr = arrayOf<Int>(0, 1, 2, 3, 4)
    try {
        print("${arr[6]}")
    } catch (ae : ArrayIndexOutOfBoundsException) {
        print(ae.message)
    }
}