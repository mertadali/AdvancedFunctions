package com.mertadali.kotlinadvancedfunction


fun main(){

    // FILTER
    val numMyList = listOf<Int>(1,3,5,7,9,11,12,16,18,2,9,31)
    val smallThanSevenNumbers = numMyList.filter { num -> num <7 }
    for (num in smallThanSevenNumbers){
       // println(num)
    }

    val numMySecondList = listOf<Int>(1,2,5,7,31,45,21,11,6,8,9,13)
    val smallThanElevenNumbers = numMySecondList.filter {
        it < 11
    }
    for (it in smallThanElevenNumbers){
      //  println(it)
    }

    // MAP
    val squaredNumbers = numMyList.map { num -> num * num }
    for (num in squaredNumbers){
       // println(num)
    }

    // FILTER VE  MAP KULLANIMI
    val filterAndMapNumbers = numMyList.filter { num -> num > 7 }.map { num -> (num * num) /10 }
    for (num in filterAndMapNumbers){
      //  println(num)
    }

    val musicians = listOf<Musicians>(
        Musicians("Mert",24,"Guitar"),
        Musicians("Miray",23,"Violin"),
        Musicians("Canbazoğlu",45,"Guitar"),
        Musicians("Adalı",46,"Drum")
    )

    val youngerMusicians = musicians.filter { Musicians -> Musicians.age < 45 }.map { Musicians -> Musicians.instruement }
    for (Musicians in youngerMusicians){
        println(Musicians)
    }


}

data class Musicians(val name : String, val age : Int, val instruement : String)
