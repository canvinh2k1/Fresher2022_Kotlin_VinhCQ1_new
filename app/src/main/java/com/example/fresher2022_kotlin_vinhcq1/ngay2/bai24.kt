package com.example.fresher2022_kotlin_vinhcq1.ngay2

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    caculateSum(number) { number: Int ->
        var sum = 0
        var temp = number
        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        sum
    }
}

fun caculateSum(number : Int, caculate: (Int) -> Int) {
    println(caculate(number))
}