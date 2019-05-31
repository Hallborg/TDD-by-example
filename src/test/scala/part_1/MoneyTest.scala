package part_1

import org.specs2.mutable.Specification

final class MoneyTest extends Specification {

	"Dollar" can {
		"multiply a number" in {
			val five = Money.dollar(5)

			five * 2 shouldEqual Money.dollar(10)
			five * 3 shouldEqual Money.dollar(15)
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

		"not be equal to a franc" in {
			val franc = Money.franc(5)
			val dollar = Money.dollar(5)

			dollar shouldNotEqual franc
		}

		"add a dollar" in {
			val five = Money.dollar(5)
			val sum = five + five
			val bank = new Bank
			val reduced = bank.reduce(sum, "USD")
			Money.dollar(10) shouldEqual reduced
		}

		"return a Sum" in {
			val five = Money.dollar(5)

			val result = five + five
			val sum = result.asInstanceOf[Sum]

			five shouldEqual sum.augend
			five shouldEqual sum.addend
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
			new Money(10, "CHF") shouldEqual Money.franc(10)
		}
	}
	"make addition with mixed currencies" in {
		val fiveDollars: Expression = Money.dollar(5)
		val tenFrancs: Expression = Money.franc(10)
		val bank = new Bank

		bank.addRate("CHF", "USD", 2)
		val result = bank.reduce(fiveDollars + tenFrancs, "USD")

		result shouldEqual Money.dollar(10)
	}
	"make addition on Sum" in {
		val fiveDollars: Expression = Money.dollar(5)
		val tenFrancs: Expression = Money.franc(10)
		val bank = new Bank

		bank.addRate("CHF", "USD", 2)
		val sum = Sum(fiveDollars, tenFrancs) + fiveDollars
		val result = bank.reduce(sum, "USD")

		result shouldEqual Money.dollar(15)
	}

	"make multiplication on Sum" in {
		val fiveDollars: Expression = Money.dollar(5)
		val tenFrancs: Expression = Money.franc(10)
		val bank = new Bank

		bank.addRate("CHF", "USD", 2)
		val sum = Sum(fiveDollars, tenFrancs) * 2
		val result = bank.reduce(sum, "USD")

		result shouldEqual Money.dollar(20)

	}
}
