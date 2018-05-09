package vn.fpt.tutorial2_trait

/**
  * Created by Hoang on 5/9/2018.
  */
class TraitDemo {
  trait Saiyan
  trait Namek
  class Human
  class Good

  // Một Trait hoặc một class có thể kế thừa nhiều trait khác nhau (tính năng này gọi là Mixin hoặc Multiple inheritance)
  // Không thể khởi tạo trực tiếp instance từ Trait.
  // Không thể nhận parameter (constructor parameter) như class.
  // Multiple inheritance
  class SuperHero extends Human with Namek with Saiyan

  class SaiyanSoldier extends Saiyan

  object SaiyanArmy{
    val bardock = new SaiyanSoldier
    val kingVegeta = new Saiyan {}
  }

  // Không thể nhận constructor như class
  trait DemoContr{
    val name: String
  }

  class DemoExtendsContr (val name: String) extends DemoContr

  object DemoObj{
    var bardock = new DemoExtendsContr("Tạ Duy Hoàng")
    var demoContr = new DemoContr {
      override val name: String = "Tạ Duy Hoàng"
    }
  }
}
