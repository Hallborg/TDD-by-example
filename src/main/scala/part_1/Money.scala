package part_1

abstract class Money(protected val amount: Int, protected val currency: String) {
	def times(multiplier: Int): Money
	override def equals(obj: Any): Boolean = obj.asInstanceOf[Money].amount == this.amount && obj.getClass == this.getClass
}

object Money {
	def dollar(amount: Int): Money = new Dollar(amount)
	def franc(amount: Int): Money = new Franc(amount)
}
