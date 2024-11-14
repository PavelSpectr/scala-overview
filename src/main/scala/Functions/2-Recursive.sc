//val factorial = (n: Int)  =>
//  if(n == 0) 1 else n * factorial(n - 1) // Cyclic Error

/**
 Основное правило при написании рекурсивных функций -
 явно указывать их функциональный тип
 */

val factorial: Int => Int = n =>
  if (n == 0) 1 else n * factorial(n - 1)

factorial(11)


