package part_1

class Franc(amount: Int, currency: String = "CHF") extends Money(amount, currency){
	def times(multiplier: Int): Money  = Money.franc(amount * multiplier)
}
