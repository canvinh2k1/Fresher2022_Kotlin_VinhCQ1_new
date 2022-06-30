package com.example.fresher2022_kotlin_vinhcq1.ngay2

fun main(args: Array<String>) {
    val n : Int = readLine()!!.toInt()
    val sum = tong(n)
    print(sum)
}

fun tong(n : Int) : Int {
    if (n == 1) return 1;
    return tong(n - 1) + n;
}