package vn.fpt.tutorial2_trait

/**
  * Created by Hoang on 5/9/2018.
  */
object SelftypesDemo extends App{
  trait Saiyan{
    def kemahameha(): Unit
  }

  trait SupperSaiyan{
    self: Saiyan =>

    def demage(): Unit = kemahameha()
  }

  trait SaiyanSoldier extends Saiyan{
    override def kemahameha(): Unit = println("Ta Duy Hoang")
  }

  val vegeta = new SupperSaiyan with SaiyanSoldier
  vegeta.demage()
}
