package part_1

class Franc(private val amount: Int) {
	def times(multiplier: Int): Franc = {
		new Franc(amount * multiplier)
	}

	override def equals(obj: Any): Boolean = obj.asInstanceOf[Franc].amount == this.amount
}
