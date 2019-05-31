package part_1

import scala.collection.mutable

class Bank {

	private case class Rate(from: String, to: String, rate: Int)
	private val rates = mutable.HashMap[(String,String), Int]()
	private val defaultExchangeRate = 1

	def rate(from: String, to: String):Int = {
		rates.get(from, to).getOrElse(defaultExchangeRate)
	}

	def addRate(from: String, to: String, rate: Int): Unit = rates.+= ((from,to) -> rate)

	def reduce(source: Expression, to: String): Money = source.reduce(this, to)
}
