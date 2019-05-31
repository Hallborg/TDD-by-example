package part_1

import org.specs2.mutable.Specification

final class DollarTest extends Specification {

	"Dollar" can {
		"multiply a number" in {
			val five = Money.dollar(5)

			five.times(2) shouldEqual Money.dollar(10)
			five.times(3) shouldEqual Money.dollar(15)
		}

		"be equal to another instance of dollar" in {
			val five1 = Money.dollar(5)
			val five2 = Money.dollar(5)

			five1 shouldEqual five2
		}
		"be unequal to another instance of dollar" in {
			val five = Money.dollar(5)
			val six = Money.dollar(6)

			five shouldNotEqual six
		}
	}
	"The currency of money" should {
		"be available for all money implementation" in {
			"USD" shouldEqual Money.dollar(1).currency
			"CHF" shouldEqual Money.franc(1).currency
		}
	}

	"Money" can {
		"be equal to a Franc" in {
			new Money(10, "CHF") shouldEqual new Franc(10)
		}
	}
}
