package part_1

import org.specs2.mutable.Specification

final class DollarTest extends Specification {

	"Dollar" can {
		"multiply a number" in {
			val five = new Dollar(5)

			val ten = five.times(2)
			val fifteen = five.times(3)

			ten.amount shouldEqual 10
			fifteen.amount shouldEqual 15
		}

		"be equal to another instance of dollar" in {
			val five1 = new Dollar(5)
			val five2 = new Dollar(5)

			five1 shouldEqual five2
		}
		"be unequal to another instance of dollar" in {
			val five = new Dollar(5)
			val six = new Dollar(6)

			five shouldNotEqual six
		}
	}
}
