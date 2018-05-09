package vn.fpt.tutorial0

/**
  * Created by Hoang on 5/8/2018.
  */
class Student(val name: String, val age: Int) {
  // Method không có gì ở đầu thì mặc định là public, tức là có thể truy cập ở bất cứ đâu.
  def +(student: Student): Student = {
    new Student(name + student.name, age + student.age)
  }

  //Curry method
  def union(student1: Student)(student2: Student): Student = student1 + student2
}
