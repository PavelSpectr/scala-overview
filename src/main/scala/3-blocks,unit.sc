val v3 = { // Присвоили блок значению v3
  val v1 = 1
  val v2 = v1 + 1
  v2 + 1
}

//println(v1) // v1 unreacheable
//Переменные не видны вне блока
//Блок кода можно присвоить переменной

val v4: Unit = { //Unit ~~ or == void in java

}

() // void or Unit

v4 == ()
