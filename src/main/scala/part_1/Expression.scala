package part_1

trait Expression {
	def reduce(bank: Bank, to: String): Money
}
