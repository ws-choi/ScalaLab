abstract class _Expr
case class _Var (name: String) extends _Expr
case class _Number (num: Double) extends _Expr
case class _UnOp(operator: String, arg: _Expr) extends _Expr
case class _BinOp(name: String, left: _Expr, right: _Expr) extends _Expr




object main_ {
  def main(args: Array[String]) {

  }
}