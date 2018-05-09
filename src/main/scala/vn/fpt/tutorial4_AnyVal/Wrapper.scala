package vn.fpt.tutorial4_AnyVal

/**
  * Created by Hoang on 5/9/2018.
  */
class Wrapper(val undelying: Int) extends AnyVal{
  def foo: Wrapper = new Wrapper(undelying * 19)
}
