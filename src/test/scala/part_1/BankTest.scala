package part_1

import org.specs2.mutable.Specification

/**
  * @author ehaljes 
  */
class BankTest extends Specification {

	"BankTest" should {
		"reduce Sum" in {
			val sum = Sum(Money.dollar(3), Money.dollar(4))
			val bank = new Bank

			val result = bank.reduce(sum, "USD")

			result shouldEqual Money.dollar(7)
		}
		"reduce Money" in {
			val bank = new Bank

			val result = bank.reduce(Money.dollar(1), "USD")

			result shouldEqual Money.dollar(1)
		}
		"be able to reduce two currencies" in {
			val bank = new Bank
			bank.addRate("CHF", "USD", 2)

			val result = bank.reduce(Money.franc(2), "USD")

			result shouldEqual Money.dollar(1)
		}
	}
}
