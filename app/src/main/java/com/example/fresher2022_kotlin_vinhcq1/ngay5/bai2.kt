package com.example.fresher2022_kotlin_vinhcq1.ngay5

import java.util.*
import kotlin.Exception

fun main(args: Array<String>) {
    val n : Int = readLine()!!.toInt()
    var arr : IntArray = IntArray(n)
    val scanner = Scanner(System.`in`)
    var count : Int = 0
    try {
        for ( i in 0 until n) {
            arr[i] = scanner.nextInt()
            if (arr[i] == 100) {
                throw Exception()
            }
            count++
        }
    } catch (ae: Exception) {
        println("Co phan tu 100")
    }
    for (j in 0 until count) {
        print("${arr[j]}, ")
    }
}