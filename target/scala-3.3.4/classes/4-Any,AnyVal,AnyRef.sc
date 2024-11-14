import java.time.{DayOfWeek, LocalDateTime}

isInstanceOf[Any]
"".isInstanceOf[Any]

class MyClass
val c = new MyClass
c.isInstanceOf[Any]

c.isInstanceOf[AnyRef]
"Hello".isInstanceOf[AnyRef]
"Hello".getClass

val v1:String = null
val v2:AnyRef = null
val v3:MyClass = null
//val v4:AnyVal = null // error

def error(message: String): Nothing =
  throw new IllegalStateException(message)

def dayOfWeek: DayOfWeek = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.THURSDAY) d
  else error("Its thursday!")
}

def dayOfWeekNum: Int = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.THURSDAY) d.getValue
  else error("Its thursday!")
}

def f(a1:Int, a2:String): String = ??? // ??? - всегда ловит NotImplementedError

f(10, "")

def infiniteLoop(): Nothing = infiniteLoop()
