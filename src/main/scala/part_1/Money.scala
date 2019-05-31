package part_1

class Money(val amount: Int, val currency: String) extends Expression {
	def reduce(to: String): Money = new Money(amount, to)

	def *(multiplier: Int): Money = new Money(amount * multiplier, currency)
	def +(obj: Money): Expression = Sum(obj , this)

	override def equals(obj: Any): Boolean = {
		val money = obj.asInstanceOf[Money]
		money.amount == this.amount && money.currency == this.currency
	}
}

object Money {
	def dollar(amount: Int): Money = new Money(amount, "USD")
	def franc(amount: Int): Money = new Money(amount, "CHF")
}
