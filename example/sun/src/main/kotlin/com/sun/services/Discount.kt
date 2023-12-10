package com.sun.services

import com.sun.models.Book
import com.sun.models.Phone
import com.sun.models.Product
import com.sun.models.VideoGame

/*
fun interface DiscountStrategy {
     fun  compute(product: Product) : Double
} // TODO Transcrire en java
*/


fun interface DiscountStrategy : (Product) -> Double {

    companion object {
        fun fixedRateStrategy(amount: Double): DiscountStrategy {
            return DiscountStrategy {
                (it.price - amount).coerceAtLeast(0.0)
            }
        }
    }
}


class DiscountService {


    private fun getDiscountedPrice(product: Product): Double {

        val discountStrategy = when (product) {
            is Phone -> DiscountStrategy.fixedRateStrategy(10.0)

            is VideoGame -> {
                DiscountStrategy {
                    (it.price - 10).coerceAtLeast(0.0)
                }
            }

            is Book -> {
                DiscountStrategy {
                    it.price * 0.5
                }
            }
        }

        return discountStrategy(product)
    }


    fun totalCartPrice(): Double {
        val book = Book(1, "ref", "name", 10.0, "model")
        val book2 = Book(1, "ref", "name", 10.0, "model")
        val phone = Phone(1, "ref", "name", 10.0, "model")
        val procts = listOf(book, book2, phone)

        return 0.0
       // return procts.sumOf { getDiscountedPrice(it).compute(it) }


    }
}


