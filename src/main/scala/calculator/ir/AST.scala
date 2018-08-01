package calculator.ir

sealed abstract class Expr

case class Num(n: Int) extends Expr
case class Plus(left: Expr, right: Expr) extends Expr
case class Minus(left: Expr, right: Expr) extends Expr
case class Multiply(left: Expr, right: Expr) extends Expr
case class Division(left: Expr, right: Expr) extends Expr
