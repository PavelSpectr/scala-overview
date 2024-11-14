import scala.io.StdIn

/*object HelloWorldApp {
  def main(args: Array[String]) : Unit = {
    println("Hello World!")
  }
}*/

object HelloWorldApp extends App {
  val name = StdIn.readLine("Hi! Enter your name: ")

  println("Hello, " + name + "!")
  println(s"Hello, $name!")

  /*println("Hello World!")*/
}