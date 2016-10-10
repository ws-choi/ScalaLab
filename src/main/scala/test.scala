import scala.language.experimental.{macros => macrosFeature}
import scala.reflect.{api => reflect}

object test {

  def main(args: Array[String]): Unit = {

    val arg = 2

    val one =
      arg%2 match {

        case 1 => "odd"
        case 0 => "even"
      }

    print(one)
  }
}
