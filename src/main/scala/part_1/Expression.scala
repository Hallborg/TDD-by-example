package part_1

trait Expression {
	def reduce(bank: Bank, to: String): Money
	def +(obj: Expression): Expression
	def *(multiplier: Int): Expression
}
