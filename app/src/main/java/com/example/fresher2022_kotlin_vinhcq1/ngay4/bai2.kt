package com.example.fresher2022_kotlin_vinhcq1.ngay4

fun <T> swap(a : Int, b : Int, list : List<T>) : List<T> {
    // khong lam truc tiep tren list goc
    // chuyen doi sang list co the thay the vi tri dc
    var test : MutableList<T> = list.toMutableList()
    var check = test.get(a)
    test.set(a, test.get(b))
    test.set(b, check)
    return test.toList()
}

fun main(args : Array<String>) {
    val arr = listOf<Int>(1,2,3,4,5,4,3,2,1)
    println(swap(1,2,arr))
}