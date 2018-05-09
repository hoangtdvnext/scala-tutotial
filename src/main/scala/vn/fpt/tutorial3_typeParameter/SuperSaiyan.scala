package vn.fpt.tutorial3_typeParameter

/**
  * Created by Hoang on 5/9/2018.
  */
class SuperSaiyan [T, R] (name: T, age: R) {
  def kamehameha(power: R) ={
    println(name.toString + age.toString + ":" + power.toString)
  }

}


