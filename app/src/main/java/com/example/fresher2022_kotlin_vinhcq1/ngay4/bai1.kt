package com.example.fresher2022_kotlin_vinhcq1.ngay4

fun <T> demSoChan(list: List<T>) : Int {
    var count = 0
    list.forEach {  it ->
        run {
            if (it.toString().toInt() % 2 == 0) {
                count ++
            }
        }
    }
    return count
}

fun main(args : Array<String>) {
    val arr = listOf<Int>(1,2,3,4,5,4,3,2,1)
    println(demSoChan(arr))
}

