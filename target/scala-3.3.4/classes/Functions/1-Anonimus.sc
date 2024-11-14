/*(x: Int) => x * x
(x: Int, y: Int) => x + y

res0(2)
res1(3, 4)*/ // this block is work!

val sqr: Int => Int = (x: Int) => x * x
val add = (x: Int, y: Int) => x + y

sqr(2)
add(3, 4)

sqr.isInstanceOf[Any]
sqr.isInstanceOf[AnyRef]

val sqr1 = new Function1[Int, Int] {
  override def apply(v1: Int) = v1 * v1
}

sqr1(2)

/**
 Дженерики в Скала записываются в [] скобках,
 а не в <> как в Java.
 Function1[Int, Int] последний Int говорит о типе возвращаемом значении
 Function от 1 до N - число в названии соответствует количеств
 аргументов в методе apply
*/

val add1 = new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int): Int = v1 + v2
}

add1(2, 3) // синтаксический сахар
add1.apply(2, 3) // полный вызов метода

// еще немного сахара
val sqr3: Int => Int = x => x * x
val add3: (Int, Int) => Int = (x, y) => x + y
val add4: (Int, Int) => Int = _ + _ // _ - является плейсхолдером

add3(4, 5)
add4(4, 5)

val add5 = (_: Int) + (_: Int)
add5(3, 7)

//Использование нескольких выражений в теле функции
val addSqr = (x: Int, y: Int) =>
  add(sqr(x), sqr(y))

addSqr(2, 3)

val addSqr2 = (x: Int, y: Int) => {
  /*val x2 = sqr(x)
  val y2 = sqr(y)*/ // or
  val f = (a: Int) => a * a
  val x2 = f(x)
  val y2 = f(y)
  add(x2, y2)
}

addSqr2(2, 3)

val addSqr3: (Int, Int) => Int = { (x, y) =>
  /*val x2 = sqr(x)
  val y2 = sqr(y)*/ // or
  val f = (a: Int) => a * a
  val x2 = f(x)
  val y2 = f(y)
  add(x2, y2)
}