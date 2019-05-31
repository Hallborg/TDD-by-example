package part_1

case class Sum(augend: Money, addend: Money) extends Expression {
	override def reduce(bank: Bank, to: String): Money = new Money(augend.amount + addend.amount, to)
}
