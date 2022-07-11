package com.example.fresher2022_kotlin_vinhcq1.ngay2

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    istotalPrime(number, ::check)
}

fun check(snt : Int) : Boolean {
    var i : Int
    if (snt == 2) return true
    for (i in 3..snt-1) {
        if ( snt % i == 0) return false
    }
    return true
}

fun istotalPrime(n : Int, check : (Int) -> Boolean) {
    var isPrime = false
    for (i in 2..n/2) {
        if (check(i) && check(n - i)) {
            println("$i + ${n - i}")
            isPrime = true
        }
    }
    if(!isPrime) print("is not")
}
