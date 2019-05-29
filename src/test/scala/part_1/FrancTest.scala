package part_1

import org.specs2.mutable.Specification

class FrancTest extends Specification {
	"Franc" can {
		"multiply" in {
			val five = Money.franc(5)
			five.times(3) shouldEqual Money.franc(15)
			five.times(2) shouldEqual Money.franc(10)
		}

		"be equal to another instance of franc" in {
			val five1 = Money.franc(5)
			val five2 = Money.franc(5)

			five1 shouldEqual five2
		}
		"be unequal to another instance of franc" in {
			val five = Money.franc(5)
			val six = Money.franc(6)

			five shouldNotEqual six
		}

		"not be equal to a dollar" in {
			val franc = Money.franc(5)
			val dollar = Money.dollar(5)

			franc shouldNotEqual dollar
		}

	}
}
