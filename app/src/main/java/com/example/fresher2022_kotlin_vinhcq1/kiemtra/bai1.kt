package com.example.fresher2022_kotlin_vinhcq1.kiemtra

import java.util.*

fun main (args : Array<String>) {
    val scanner = Scanner(System.`in`)
    var string : String= scanner.next()
    val check = palindrome(string)
    print(check)
}

fun palindrome (input : String) : Boolean {
    var string = input
    var newS = string.trimStart()
    var newSS = newS.trimEnd()
    var check = true
    for (i in newSS.indices) {
        if (newSS.get(i) != newSS[newSS.lastIndex - i])
            return false
    }
    return true
}