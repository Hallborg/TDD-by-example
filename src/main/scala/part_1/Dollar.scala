package part_1

class Dollar(amount: Int, currency: String = "USD") extends Money(amount,currency) {
	def times(multiplier: Int): Money = Money.dollar(amount * multiplier)
}
