package com.example.fresher2022_kotlin_vinhcq1.ngay2

fun main(args: Array<String>) {
    val a : Int = readLine()!!.toInt()
    val b : Int = readLine()!!.toInt()
    var i : Int
    for (i in a..b) {
        if(check(i)) {
            print("$i, ")
        }
    }
}
