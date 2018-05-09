package vn.fpt.tutorial4_AnyVal

/**
  * Created by Hoang on 5/9/2018.
  */
object DemoTutorial4 {
  case class UserId(value: Long) extends AnyVal
  case class BoardId(value: Long) extends AnyVal
  case class GroupId(value: Long) extends AnyVal
  case class UserName(value: String) extends AnyVal
  case class BoardName(value: String) extends AnyVal
}
