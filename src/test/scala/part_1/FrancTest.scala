package part_1

import org.specs2.mutable.Specification

class FrancTest extends Specification {
	"Franc" can {
		"multiply" in {
			val five = new Franc(5)
			five.times(3) shouldEqual new Franc(15)
			five.times(2) shouldEqual new Franc(10)
		}

		"be equal to another instance of franc" in {
			val five1 = new Franc(5)
			val five2 = new Franc(5)

			five1 shouldEqual five2
		}
		"be unequal to another instance of franc" in {
			val five = new Franc(5)
			val six = new Franc(6)

			five shouldNotEqual six
		}

		"not be equal to a Dollar" in {
			val franc = new Franc(5)
			val dollar = new Dollar(5)

			franc shouldNotEqual dollar
		}

	}
}
