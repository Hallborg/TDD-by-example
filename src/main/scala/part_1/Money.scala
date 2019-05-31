package part_1

class Money(protected val amount: Int, val currency: String) {
	def times(multiplier: Int): Money = new Money(amount * multiplier, currency)
	override def equals(obj: Any): Boolean = {
		val money = obj.asInstanceOf[Money]
		money.amount == this.amount && money.currency == this.currency
	}
}

object Money {
	def dollar(amount: Int): Money = new Dollar(amount)
	def franc(amount: Int): Money = new Franc(amount)
}
