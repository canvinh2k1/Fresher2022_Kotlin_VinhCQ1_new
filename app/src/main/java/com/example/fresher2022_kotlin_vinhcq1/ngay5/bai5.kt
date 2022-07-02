package com.example.fresher2022_kotlin_vinhcq1.ngay5
import java.util.*
import kotlin.collections.ArrayList

class nhanvien(name : String, sex : String, bday : String, sdt : String, id : Int, level : String) {
    private var name : String = ""
    private var sex : String = ""
    private var bday : String = ""
    private var sdt : String = ""
    private var id : Int = 0
    private var level : String = ""

    init{
        this.name = name
        this.sex = sex
        this.bday = bday
        this.sdt = sdt
        this.id = id
        this.level = level
    }
    fun getName() : String{
        return name
    }
    fun getSex() : String{
        return sex
    }
    fun getBday() : String{
        return bday
    }
    fun getSdt() : String{
        return sdt
    }
    fun getId() : Int{
        return id
    }
    fun getLevel() : String {
        return level
    }

    fun setName(value : String) {
        name = value
    }
    fun setSex(value : String) {
        sex = value
    }
    fun setBday(value : String) {
        bday = value
    }
    fun setSdt(value : String) {
        sdt = value
    }
    fun setId(value : Int) {
        id = value
    }
    fun setLevel(value : String) {
        level = value
    }
}

fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    val arr = ArrayList<nhanvien>()
    while(true) {
        var string = scanner.next()
        when (string) {
            "add" -> funAdd(arr)
            "display" -> funDisplay(arr)
            "update" -> funUpdate(arr)
            "find" -> funFind(arr)
            "done" -> break;
        }
    }
}

fun funAdd(arr: ArrayList<nhanvien>) {
    println("Them nhan vien: ")
    print("Id (tu dong): ")
    var id = (0..100).random()
    print(id)
    print("\nTen: ")
    val scanner = Scanner(System.`in`)
    var name = scanner.nextLine()
    print("Gioi tinh: ")
    var sex = scanner.next()
    print("Ngay sinh: ")
    var bday = scanner.next()
    print("So dien thoai: ")
    var sdt = scanner.next()
    // de loai bo enter phia trc
    var test = scanner.nextLine()
    print("Trinh do chuyen mon: ")
    var level = scanner.nextLine()
    val nv = nhanvien(name,sex,bday,sdt,id,level)
    arr.add(nv)
}
fun funDisplay(arr: ArrayList<nhanvien>) {
    if (arr.isEmpty()) {
        println("Not found information")
    } else {
        for (i in arr.indices) {
            println("Id nhan vien: ${arr[i].getId()}")
            println("Ten: ${arr[i].getName()}")
            println("Gioi tinh: ${arr[i].getSex()}")
            println("Ngay sinh: ${arr[i].getBday()}")
            println("SO dien thoai: ${arr[i].getSdt()}")
            println("Trinh do chuyen mon: ${arr[i].getLevel()}")
            println()
        }
    }
}

fun funUpdate(arr: ArrayList<nhanvien>) {
    print("Den Id nhan vien ban muon cap nhat thong tin: ")
    var number = readLine()!!.toInt()
    var flag : Boolean = false
    for (i in arr.indices) {
        if (arr[i].getId() == number) {
            flag = true
            print("\nTen: ")
            val scanner = Scanner(System.`in`)
            var name = scanner.nextLine()
            print("Gioi tinh: ")
            var sex = scanner.next()
            print("Ngay sinh: ")
            var bday = scanner.next()
            print("So dien thoai: ")
            var sdt = scanner.next()
            // de loai bo enter phia trc
            var test = scanner.nextLine()
            print("Trinh do chuyen mon: ")
            var level = scanner.nextLine()
            arr[i].setName(name)
            arr[i].setSex(sex)
            arr[i].setBday(bday)
            arr[i].setSdt(sdt)
            arr[i].setLevel(level)
            break
        }
    }
    if (!flag) {
        println("Not found information")
    }
}

fun funFind(arr: ArrayList<nhanvien>) {
    print("Dien Id nhan vien ban muon tim vao day")
    var number = readLine()!!.toInt()
    var flag : Boolean = false
    for (i in arr.indices) {
        if (number == arr[i].getId()) {
            flag = true
            println("Id nhan vien: ${arr[i].getId()}")
            println("Ten: ${arr[i].getName()}")
            println("Gioi tinh: ${arr[i].getSex()}")
            println("Ngay sinh: ${arr[i].getBday()}")
            println("SO dien thoai: ${arr[i].getSdt()}")
            println("Trinh do chuyen mon: ${arr[i].getLevel()}")
            println()
            break
        }
    }
    if (!flag) {
        println("Not found information")
    }
}
