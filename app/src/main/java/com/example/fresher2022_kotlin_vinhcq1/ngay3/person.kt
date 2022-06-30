package com.example.fresher2022_kotlin_vinhcq1.ngay3

open class Person constructor(name : String, sex : String, date : String, address : String){
    private var name : String = ""
    private var sex : String = ""
    private var date : String = ""
    private var address : String = ""
    init {
        this.name = name
        this.sex = sex
        this.date = date
        this.address = address
    }

    open fun inputInfo() {
        name = readLine()!!
        sex = readLine()!!
        date = readLine()!!
        address = readLine()!!
    }
    open fun showInfo() {
        println("Ten la: $name")
        println("Gioi tinh la: $sex")
        println("Ngay sinh la: $date")
        println("Dia chi la: $address")
    }

}

class Student(name : String,sex : String,date : String,address : String, masv : String, diem : Double, email : String) : Person(name ,sex ,date ,address ) {
    private var masv : String = ""
    private var diem : Double = 0.0
    private var email : String = ""
    init {
        this.masv = masv
        this.diem = diem
        this.email = email
    }
    override fun inputInfo() {
        super.inputInfo()
        this.masv = readLine()!!
        this.email = readLine()!!
        while(!email.contains("@")){
            this.email = readLine()!!
        }
        this.diem = readLine()!!.toDouble()
    }

    override fun showInfo() {
        super.showInfo()
        println("Ma so sinh vien la: $masv")
        println("Diem trung binh la: $diem")
        println("Email la: $email")
    }

    fun setHocbong() {
        if (diem >= 8.0) {
            println("Ban se nhan duoc hoc bong")
        }
    }
}
class Teacher(name : String,sex : String,date : String,address : String, lopday : String, luong : Double, sogio : Int) : Person(name ,sex ,date ,address ) {
    private var lopday : String = ""
    private var luong : Double = 0.0
    private var sogio : Int = 0

    init {
        this.lopday = lopday
        this.luong = luong
        this.sogio = sogio
    }

    override fun inputInfo() {
        super.inputInfo()
        this.lopday = readLine()!!
        this.sogio = readLine()!!.toInt()
        this.luong = readLine()!!.toDouble()
    }

    override fun showInfo() {
        super.showInfo()
        println("Lop day la: $lopday")
        println("Luon mot h la: $luong")
        println("So gio lam viec mot thang la: $sogio")
    }

    fun tinhLuong() {
        var luongSum = (luong * sogio.toDouble()).toInt()
        if (lopday.contains("L") || lopday.contains("M")) luongSum += 500000
        println("Tong luong mot thang la: $luongSum")
    }
}
fun main (args: Array<String>) {
    var sinhvien = Student("Vinh","nam","14/11/2001","ha noi","190",9.2,"canvinh@gmail.com")
    sinhvien.showInfo()
    sinhvien.setHocbong()

    var giaovien = Teacher("hang","nu","18/11/1999","ha giang","M2",100000.0, 100 )
    giaovien.showInfo()
    giaovien.tinhLuong()
}
