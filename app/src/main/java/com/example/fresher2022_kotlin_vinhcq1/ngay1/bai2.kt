package com.example.fresher2022_kotlin_vinhcq1.ngay1


fun main(args: Array<String>) {
    var num = readLine()!!.toInt()
    var num1 = num
    var ans : Int
    var i = 0
    var count = 0
    var count1 = 0
    var arr : IntArray = IntArray(20)
    var arr1 : IntArray = IntArray(20)
    // chuyen tu thap phan sang nhi phan

    while (num != 0) {
        arr[i] = num % 2
        num /= 2
        i++
    }
    count  = i - 1
    for (i in count downTo 0) {
        print("${arr[i]} ")
    }

    // chuyen tu thap phan sang thap luc phan
    i = 0
    println()
    while(num1 != 0) {
        var check = num1 % 16
        arr1[i] = check
        i++;
        num1 /= 16
    }
    count1 = i - 1
    for (i in count1 downTo 0) {
        if (arr1[i] <= 9)
            print(arr1[i])
        else if (arr1[i] == 10)
            print('A')
        else if (arr1[i] == 11)
            print('B')
        else if (arr1[i] == 12)
            print('C')
        else if (arr1[i] == 13)
            print('D')
        else if (arr1[i] == 14)
            print('E')
        else if (arr1[i] == 15)
            print('F')
    }
}