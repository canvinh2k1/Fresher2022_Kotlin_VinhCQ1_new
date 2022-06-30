package com.example.fresher2022_kotlin_vinhcq1.ngay2

fun main(args: Array<String>) {
    val hexStr = 200.toHexString()
    print(hexStr)
}

fun Int.toHexString() : String {
    var s : String ?= ""
    var k : Char ?= null
    var t = this
    while (t != 0) {
        if (t % 16 <= 9) k = (t % 16 + 48).toChar()
        else if (t % 16 in 10..15 ) k = (t % 16 + 55).toChar()
        s = k!! + s!!
        t /= 16
    }
    return s!!
}