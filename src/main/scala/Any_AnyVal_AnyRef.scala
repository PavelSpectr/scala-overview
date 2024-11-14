class Any_AnyVal_AnyRef {
  val _ = {
    val int1: Int = 1
    val int2: Int = int1
    val int3: Int = int1

    val str1: String = "str"
    val str2: AnyRef = str1
    val str3: Any = str1
  }
}
