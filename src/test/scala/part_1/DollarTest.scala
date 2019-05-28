package part_1

import org.specs2.mutable.Specification

final class DollarTest extends Specification {

	"Dollar" can {
		"multiply a number" in {
			val five = new Dollar(5)

			five.times(2) shouldEqual new Dollar(10)
			five.times(3) shouldEqual new Dollar(15)
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
