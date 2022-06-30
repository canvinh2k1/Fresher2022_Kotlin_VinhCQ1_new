package com.example.fresher2022_kotlin_vinhcq1.ngay1

fun main(args: Array<String>) {
    var s : String = readLine()!!
    var count : Int = 0
    var i : Int
    if (s[0].toInt() in 97..122) {
        var k = (s[0].toInt() - 32).toChar()
        s = k + s.substring(1, s.length)
    }
    for (i in s.indices) {
        if (s[i] == ' ' && s[i + 1] != ' ') {
            count++
        }
    }
    println(s)
    if (s[0] != ' ')
        print(count + 1)
    else
        print(count)
}
