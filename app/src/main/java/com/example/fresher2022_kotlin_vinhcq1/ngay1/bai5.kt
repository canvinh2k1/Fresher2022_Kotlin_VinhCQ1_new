package com.example.fresher2022_kotlin_vinhcq1.ngay1

fun main() {
    val month : Int
    month = readLine()!!.toInt()
    val year : Int
    year = readLine()!!.toInt()
    when (month) {
        2 -> if (thang2(year)) println("29")
        else println("28")
        4, 6, 9, 11 -> println("30")
        1, 3, 5, 7, 8, 10, 12 -> println("31")
        else -> println("sai")
    }
}

fun thang2(year: Int) : Boolean {
    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
}