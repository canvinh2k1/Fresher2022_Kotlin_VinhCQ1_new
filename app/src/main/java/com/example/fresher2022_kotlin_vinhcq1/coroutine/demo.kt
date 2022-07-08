package com.example.fresher2022_kotlin_vinhcq1.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun sayHello() {
    delay(10000L)
    print(" Basic")
}
suspend fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(10000L)
        print("World ")
    }
    runBlocking {
        print("Hi")
        delay(5000L)
    }
    print(" Hello ")
    Thread.sleep(20000L)
    delay(1000L)
    print("Kotlin")
    sayHello()
}