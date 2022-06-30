package com.example.fresher2022_kotlin_vinhcq1.ngay3

const val VAT : Double = 0.1
open class khachhang(sokhach : Int, soluonghang : Int, dongiahang : Int, tongtien : Int) {
    private var sokhach : Int = 0
    private var soluonghang : Int = 0
    private var dongiahang : Int = 0
    private var tongtien : Int = 0
    init {
        this.dongiahang = dongiahang
        this.sokhach = sokhach
        this.soluonghang = soluonghang
        this.tongtien = tongtien
    }
    fun getsokhach() :Int {
        return sokhach
    }
    fun getsoluonghang() : Int {
        return soluonghang
    }
    fun getdongiahang() : Int {
        return dongiahang
    }
    fun setTongtien(value : Int) {
        this.tongtien =value
    }
    fun getTongtien() : Int {
        return tongtien
    }
    open fun sotienkhachtra() {

    }

    open fun show() {
        println("Tong so tien Khach tra la: $tongtien")
    }
}

class loaiA(sokhach : Int, soluonghang : Int, dongiahang : Int, tongtien : Int) : khachhang (sokhach, soluonghang, dongiahang, tongtien) {
    override fun sotienkhachtra() {
        var check = (super.getsoluonghang() * super.getdongiahang()) * (1 + VAT)
        super.setTongtien(check.toInt())
    }
}

class loaiB(sokhach : Int, soluonghang : Int, dongiahang : Int, tongtien : Int, khuyenmai : Double) : khachhang (sokhach, soluonghang, dongiahang, tongtien) {
    private var khuyenmai : Double = 0.0
    init {
        this.khuyenmai = khuyenmai
    }

    override fun sotienkhachtra() {
        var check = (super.getsoluonghang() * super.getdongiahang()) * (1 + VAT - khuyenmai)
        super.setTongtien(check.toInt())
    }
}

class loaiC(sokhach : Int, soluonghang : Int, dongiahang : Int, tongtien : Int) : khachhang (sokhach, soluonghang, dongiahang, tongtien) {
    override fun sotienkhachtra() {
        var check = (super.getsoluonghang() * super.getdongiahang()) * (0.5 + VAT)
        super.setTongtien(check.toInt())
    }
}

fun main(args : Array<String>) {
    var a = loaiA(10, 20, 30, 0)
    a.sotienkhachtra()
    println("Loai A")
    a.show()

    var b = loaiB(10, 20, 30, 0, 0.2)
    b.sotienkhachtra()
    println("Loai B")
    b.show()

    var c = loaiC(10, 20, 30, 0)
    c.sotienkhachtra()
    println("Loai C")
    c.show()

    var Tong = a.getsokhach() * a.getTongtien() + b.getsokhach() * b.getTongtien() + c.getsokhach() * c.getTongtien()
    println("Cong ty \nTong so tien con ty thu duoc la : $Tong")
}