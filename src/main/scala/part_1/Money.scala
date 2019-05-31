package part_1

class Money(val amount: Int, val currency: String) extends Expression {
	def *(multiplier: Int): Money = new Money(amount * multiplier, currency)

	def +(obj: Money): Expression = Sum(obj, this)

	override def equals(obj: Any): Boolean = {
		val money = obj.asInstanceOf[Money]
		money.amount == this.amount && money.currency == this.currency
	}

	override def toString: String = amount + " " + currency

	override def reduce(bank: Bank, to: String): Money = {
		val rate = bank.rate(currency, to)
		new Money(amount / rate, to)
	}
}

object Money {
	def dollar(amount: Int): Money = new Money(amount, "USD")

	def franc(amount: Int): Money = new Money(amount, "CHF")
}
