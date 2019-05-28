package part_1

class Dollar(val amount: Int) {
	def times(multiplier: Int):Dollar = {
		new Dollar(amount * multiplier)
	}

	override def equals(obj: Any): Boolean = obj.asInstanceOf[Dollar].amount == this.amount
}
