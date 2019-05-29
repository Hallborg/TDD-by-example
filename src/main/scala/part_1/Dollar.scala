package part_1

class Dollar(private val anAmount: Int) extends Money(anAmount) {
	def times(multiplier: Int):Dollar = {
		new Dollar(amount * multiplier)
	}
}
