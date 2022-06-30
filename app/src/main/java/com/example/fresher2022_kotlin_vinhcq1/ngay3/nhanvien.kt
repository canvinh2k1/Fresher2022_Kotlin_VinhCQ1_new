package com.example.fresher2022_kotlin_vinhcq1.ngay3

open class Nhanvien constructor(hoten : String, ngaysinh : String, luong : Int){
    private var hoten : String = ""
    private var ngaysinh : String = ""
    private var luong : Int = 0

    init{
        this.luong = luong
        this.hoten = hoten
        this.ngaysinh = ngaysinh
    }
    fun getluong() : Int {
        return luong
    }
    fun setluong(value : Int) {
        this.luong = value
    }
    open fun tinhluong() {

    }
    open fun show() {
        println("Ho va ten la: $hoten")
        println("Ngay sinh la: $ngaysinh")
        println("Luong la: $luong")
    }
}

class sanxuat (hoten : String, ngaysinh : String, luong : Int, canban : Int, sosp : Int) : Nhanvien(hoten, ngaysinh, luong) {
    private var canban : Int = 0
    private var sosp : Int = 0
    init{
        this.canban = canban
        this.sosp = sosp
    }
    override fun tinhluong() {
        var check = canban + sosp*5000
        super.setluong(check)
    }
}
class vanphong (hoten : String, ngaysinh : String, luong : Int, songay : Int) : Nhanvien(hoten, ngaysinh, luong) {
    private var songay : Int = 0
    init {
        this.songay = songay
    }
    override fun tinhluong() {
        var check = songay * 100000
        super.setluong(check)
    }
}

fun main(args : Array<String>) {
    var nhanviensanxuat = sanxuat("vinh","14/11/2001",0,200000, 30)
    nhanviensanxuat.tinhluong()
    nhanviensanxuat.show()
    var nhanvienvanphong = vanphong("hang","18/11/1999",0, 30)
    nhanvienvanphong.tinhluong()
    nhanvienvanphong.show()
}
