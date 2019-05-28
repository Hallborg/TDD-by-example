package part_1

import org.specs2.mutable.Specification

final class DollarTest extends Specification {

	"Dollar" can {
		"multiply a number" in {
			val five = new Dollar(5)
			five.times(2)
			five.amount shouldEqual 10
		}
	}
}
