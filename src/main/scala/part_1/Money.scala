package part_1

class Money(protected val amount: Int) {

	override def equals(obj: Any): Boolean = obj.asInstanceOf[Money].amount == this.amount
}
