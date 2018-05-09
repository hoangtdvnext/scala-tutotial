package vn.fpt.tutorial3_typeParameter

/**
  * Created by Hoang on 5/9/2018.
  */
object DemoMain {

  def main(args: Array[String]): Unit = {
    val goku = new SuperSaiyan[String, Int]("Hoang", 100)
    goku.kamehameha(1000)
    // Error: Type mismatch
    // goku.kamehameha("Demo")
  }
}
