package com.mertadali.kotlinadvancedfunction

fun main(){
    // Predicate (belirtmek, doğrulamak)

    val numMyList = listOf<Int>(1,3,5,3,12,18,6,9,43,7,54)

    // All   -> Tüm sayılar 5 den büyükse true değilse false döndürür.

   val checkMyList =  numMyList.all { it > 5 }
    println(checkMyList)

    // Any -> Herhangi bir sayı 5 den büyükse true döndürür.

    val anyCheckMyList = numMyList.any { it > 5 }
    println(anyCheckMyList)

    // Count -> 5 den büyük kaç tane sayı var onu yazdırır.
    val countMyList = numMyList.count { it > 5 }
    println(countMyList)

    // Find -> 5 den büyük ilk elemanı getirmeye yarar.
    val findMyList = numMyList.find { it > 5 }
    println(findMyList)

    // FindLast -> 5 den büyük son elemanı bulur
    val findLastNum = numMyList.findLast { it > 5 }
    println(findLastNum)

}