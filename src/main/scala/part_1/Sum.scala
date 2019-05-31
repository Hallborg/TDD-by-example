package part_1

case class Sum(augend: Money, addend: Money) extends Expression {
	def reduce(currency: String): Money = new Money(augend.amount + addend.amount, currency)
}
