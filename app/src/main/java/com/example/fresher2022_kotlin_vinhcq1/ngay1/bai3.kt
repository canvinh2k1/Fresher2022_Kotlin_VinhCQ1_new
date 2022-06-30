package com.example.fresher2022_kotlin_vinhcq1.ngay1

fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var arr : IntArray = IntArray(n)
    var i : Int
    var j : Int
    for (i in 0 until n step 1) {
        arr[i] = readLine()!!.toInt()
    }
    for (i in 0 until n step 1) {
        for (j in i + 1 until n step 1) {
            if (arr[i] > arr[j]) {
                var temp: Int = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for (i in 0 until n step 1) {
        print("${arr[i]}, ")
    }
}