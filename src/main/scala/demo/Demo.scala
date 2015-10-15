package demo

import flow.Flow
import helperClass.MX

/**
 * Created by kasonchan on 10/9/15.
 */
object Demo {

  def main(args: Array[String]) {
    val inputs = List(MX(Some(1.5), Some(3)), MX(Some(4), Some(2.5)))
    val outputs = List(MX(Some(5), None))

    println(Flow.solve(inputs, outputs))
  }

}
