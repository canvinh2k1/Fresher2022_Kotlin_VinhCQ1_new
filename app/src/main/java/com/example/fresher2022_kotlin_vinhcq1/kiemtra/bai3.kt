package com.example.fresher2022_kotlin_vinhcq1.kiemtra

class Queue<T> {
    var arr = ArrayList<T>()
    fun isEmpty() : Boolean {
        return arr.isEmpty()
    }
    fun getSize() : Int {
        return arr.size
    }
    fun enQueue(elements : T) {
        arr.add(elements)
    }
    fun peek() : T? {
        if (isEmpty()) return null
        else {
            return arr[0]
        }
    }
    fun deQueue() : T? {
        if (isEmpty()) return null
        else {
            val check = arr[0]
            arr.remove(arr[0])
            return check
        }
    }
}

fun main(args : Array<String>) {
    // Voi kieu Char
    println("Test Queue voi kieu du lieu Char: ")
    val s : Queue<Char> = Queue()
    print("Queue co rong hay khong: ")
    println(s.isEmpty())
    // them phan tu cho Stack
    s.enQueue('A')
    s.enQueue('B')
    s.enQueue('C')

    print("So phan tu cua Queue: ")
    println(s.getSize())
    print("Kiem tra Queue co rong hay khong sau khi them phan tu: ")
    println(s.isEmpty())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(s.deQueue())
    print("Phan tu dau tien cua Queue sau khi loai bo: ")
    println(s.peek())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(s.deQueue())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(s.deQueue())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(s.deQueue())

    println()

    // Voi kieu Int
    println("Test Queue voi kieu du lieu Int: ")
    val x : Queue<Int> = Queue()
    print("Queue co rong hay khong: ")
    println(x.isEmpty())
    // them phan tu cho Stack
    x.enQueue(1)
    x.enQueue(2)
    x.enQueue(3)

    print("So phan tu cua Queue: ")
    println(x.getSize())
    print("Kiem tra Queue co rong hay khong sau khi them phan tu: ")
    println(x.isEmpty())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(x.deQueue())
    print("Phan tu dau tien cua Queue sau khi loai bo: ")
    println(x.peek())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(x.deQueue())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(x.deQueue())
    print("Phan tu dau tien cua Queue va loai bo: ")
    println(x.deQueue())
}