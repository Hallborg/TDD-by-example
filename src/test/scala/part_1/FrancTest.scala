package part_1

import org.specs2.mutable.Specification

class FrancTest extends Specification {
	"Franc" can {
		"multiply" in {
			val five = new Franc(5)
			five.times(3) shouldEqual new Franc(15)
			five.times(2) shouldEqual new Franc(10)
		}
	}
}
