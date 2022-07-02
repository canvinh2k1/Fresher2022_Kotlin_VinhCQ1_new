package com.example.fresher2022_kotlin_vinhcq1.ngay5

fun main (args : Array<String>) {
    val color = arrayOf<Char>('a', 'b', 'c','d','e', 'f')
    val color2 = arrayOf<Char>('g', 'l', 'm', 'n', 'k')

    val list : MutableList<Char> = mutableListOf<Char>(*color)
    val list2 : MutableList<Char> = mutableListOf<Char>(*color2)
    println("Sau khi nap du lieu cho 2 list tu 2 mang")
    list.forEach{print("$it, ")}
    println()
    list2.forEach{print("$it, ")}

    for (i in list2.indices) {
        list.add(list2[i])
    }
    list2.clear()
    println("\nSau khi chuyen list 2 vao list")
    list.forEach{print("$it, ")}
    println()
    list2.forEach{print("$it, ")}

    for(i in list.indices) {
        if (list[i].toInt() in 97..122) {
            list[i] = (list[i].toInt() - 32).toChar()
        }
    }
    println("\nSau khi viet hoa tat ca cac thanh phan co trong list")
    list.forEach{print("$it, ")}

    for (i in list.indices) {
        if (i in 3..5) {
            list.removeAt(i)
        }
    }
    println("\nSau khi xoa cac phan tu thu 4 den thu 6 co trong list")
    list.forEach{print("$it, ")}

    list.reverse()
    println("\nSau khi dao nguoc cac phan tu co trong list")
    list.forEach{print("$it, ")}
}