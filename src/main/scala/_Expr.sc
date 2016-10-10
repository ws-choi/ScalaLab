val v = _Var("x")
val op = _BinOp("+", _Number(1), v)

def simplifyTop(expr: _Expr): _Expr = expr match {
  case _UnOp("-", _UnOp("-", e)) => e
  case _BinOp("+", e, _Number(0)) => e
  case _BinOp("*", e, _Number(1)) => e
  case _ => expr
}
def optimize( expr: _Expr) : _Expr = {
  def optimize ( expr: _Expr, old_expr: _Expr): _Expr = {
    if(expr == old_expr) expr
    else optimize(simplifyTop(expr), expr)
  }
  optimize(simplifyTop(expr), expr)
}

simplifyTop ( _UnOp("-", _UnOp("-",  _UnOp("-", _UnOp("-", _Number(1)))  )) )
optimize( _UnOp("-", _UnOp("-",  _UnOp("-", _UnOp("-", _Number(1)))  )))
