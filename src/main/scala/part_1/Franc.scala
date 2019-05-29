package part_1

class Franc(private val anAmount: Int) extends Money(anAmount){
	def times(multiplier: Int): Franc = {
		new Franc(amount * multiplier)
	}
}
