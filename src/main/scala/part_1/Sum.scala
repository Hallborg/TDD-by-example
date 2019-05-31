package part_1

case class Sum(augend: Expression, addend: Expression) extends Expression {
	override def reduce(bank: Bank, to: String): Money =
		new Money(augend.reduce(bank, to).amount + addend.reduce(bank, to).amount, to)

	override def +(obj: Expression): Expression = Sum(obj,this)

	def *(multiplier: Int): Expression = Sum(augend * multiplier, addend * multiplier)
}
