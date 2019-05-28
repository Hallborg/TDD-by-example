package part_1

class Dollar(val amount: Int) {
	def times(multiplier: Int):Dollar = {
		new Dollar(amount * multiplier)
	}
}
