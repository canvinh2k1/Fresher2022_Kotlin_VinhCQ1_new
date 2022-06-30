package com.example.fresher2022_kotlin_vinhcq1.ngay2

fun main(args: Array<String>) {
    val test : Int = 18
    var i : Int
    var k : Int
    var a : Boolean = false
    for (i in 2..test/2 ) {
        if (check(i) && check(test - i)) {
            println("$test = $i + ${test - i}")
        }
    }
}

fun check(snt : Int) : Boolean {
    var i : Int
    if (snt == 2) return true
    for (i in 3..snt-1) {
        if ( snt % i == 0) return false
    }
    return true
}
