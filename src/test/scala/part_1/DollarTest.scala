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
	}
}
