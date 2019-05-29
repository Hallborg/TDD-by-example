package part_1

class Dollar(private val anAmount: Int) extends Money(anAmount) {
	def times(multiplier: Int): Money = {
		new Dollar(amount * multiplier)
	}
}
