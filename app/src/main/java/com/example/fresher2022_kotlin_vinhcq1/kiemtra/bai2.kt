package com.example.fresher2022_kotlin_vinhcq1.kiemtra

class Stack<T> {
    var arr = ArrayList<T>()
    fun isEmpty() : Boolean {
        return arr.isEmpty()
    }
    fun getSize() : Int {
        return arr.size
    }
    fun put(elements : T) {
        arr.add(elements)
    }
    fun pop() : T? {
        if (isEmpty()) return null
        else {
            val check = arr[getSize() - 1]
            arr.remove(arr[getSize() - 1])
            return check
        }
    }
    fun peek() : T? {
        if (isEmpty()) return null
        else {
            return arr[getSize() - 1]
        }
    }
    fun remove() {
        if (isEmpty()) println("Stack rong")
        else {
            arr.remove(arr[getSize() - 1])
        }
    }
}

fun main(args : Array<String>) {
    // Voi kieu Char
    println("Test Stack voi kieu du lieu Char: ")
    val s : Stack<Char> = Stack()
    print("Stack co rong hay khong: ")
    println(s.isEmpty())
    // them phan tu cho Stack
    s.put('v')
    s.put('i')
    s.put('n')
    s.put('h')
    print("So phan tu cua Stack: ")
    println(s.getSize())
    print("Kiem tra Stack co rong hay khong sau khi them phan tu: ")
    println(s.isEmpty())
    print("Phan tu cuoi cua Stack va loai bo: ")
    println(s.pop())
    print("Phan tu cuoi cua Stack sau khi loai bo: ")
    println(s.peek())
    print("Tiep tuc loai bo: ")
    s.remove()
    println(s.peek())

    println()

    //Voi kieu Int
    println("Test Stack voi kieu du lieu Int: ")
    val x : Stack<Int> = Stack()
    print("Stack co rong hay khong: ")
    println(x.isEmpty())
    // them phan tu cho Stack
    x.put(1)
    x.put(2)
    x.put(3)
    x.put(4)
    print("So phan tu cua Stack: ")
    println(x.getSize())
    print("Kiem tra Stack co rong hay khong sau khi them phan tu: ")
    println(x.isEmpty())
    print("Phan tu cuoi cua Stack va loai bo: ")
    println(x.pop())
    print("Phan tu cuoi cua Stack sau khi loai bo: ")
    println(x.peek())
    print("Tiep tuc loai bo: ")
    x.remove()
    println(x.peek())
    print("Tiep tuc loai bo: ")
    println(x.pop())
    print("Tiep tuc loai bo: ")
    println(x.pop())
    print("Tiep tuc loai bo: ")
    println(x.pop())
}
