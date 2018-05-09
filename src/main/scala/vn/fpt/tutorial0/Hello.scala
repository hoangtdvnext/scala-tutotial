package vn.fpt.tutorial0

/**
  * Created by Hoang on 5/8/2018.
  */
object Hello extends App {
  println("Hello world!!!")
  val hoang = new Student("Tạ Duy Hoàng", 25)
  val hiep = new Student("Dương Văn Hiệp", 22)
  val tmp = hoang + hiep;

  println(tmp.name)
  println(tmp.age)

  //khi chỉ gọi một dãy parameter thì curry method sẽ trả về một function.
  val unionDemo = hoang.union(hiep)(hoang)
}
