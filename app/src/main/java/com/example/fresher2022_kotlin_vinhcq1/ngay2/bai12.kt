package com.example.fresher2022_kotlin_vinhcq1.ngay2

fun main(args: Array<String>) {
    val result = "C8".toBinaryString()
    print(result)
}

fun String.toBinaryString() : String {
    var i : Int
    var result : String = ""
    for (i in 0..this.length - 1) {
        var check : Int = this[i].toInt()
        var test : Int
        if (check >= 65) test = check - 55
        else test = check - 48
        var s : String = ""
        var k : Char
        while (test != 0) {
            k = (test % 2 + 48).toChar()
            test /= 2
            s = k + s
        }
        result += s
    }
    return result
}