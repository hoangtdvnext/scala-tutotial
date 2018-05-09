package vn.fpt.tutorial1_oop

/**
  * Created by Hoang on 5/8/2018.
  */
class SuperSaiyan(age:Int) extends Saiyan(age){
  override def recover(): Unit = {
    println(age * 10)
  }
}
