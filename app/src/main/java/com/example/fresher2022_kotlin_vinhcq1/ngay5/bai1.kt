package com.example.fresher2022_kotlin_vinhcq1.ngay5
import java.lang.Double.parseDouble
import java.util.*

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()

    var numeric = true

    try {
        val num = parseDouble(a)
        val num1 = parseDouble(b)
    } catch (e: NumberFormatException) {
        numeric = false
    }

    if (numeric) {
        try {
            val aa = a.toDouble()
            val bb = b.toDouble()
            if (bb == 0.0) throw ArithmeticException()
            val cc = aa / bb
            println("$aa / $bb = $cc")
        } catch (ae: ArithmeticException) {
            println("Chia cho 0")
        }
    }
    else {
        println("It is not numbers")
    }
}

