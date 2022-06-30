package com.example.fresher2022_kotlin_vinhcq1.ngay4

fun <T: Comparable<*>> timSoLonNhat(a: Int, b: Int, list : List <T>) : T {
    var max : T = list.get(0)
    for(i in a until b) {
        if (compareValues(list.get(i), max) == 1) {
            max = list.get(i)
        }
    }
    return max
}

fun main(args : Array<String>) {
    val arr = listOf<Int>(1,2,3,4,5,4,3,2,1)
    println(timSoLonNhat(1,5,arr))
}