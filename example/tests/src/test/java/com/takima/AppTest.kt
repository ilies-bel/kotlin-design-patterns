package com.takima;

import com.moon.models.Address
import com.moon.services.CartService
import com.sun.persistence.CartDao
import com.sun.services.DiscountStrategy
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppTest()
{
    @Test
    fun singleton() {
        val app = CartService.INSTANCE
        val app2 = CartDao
        assert(app === CartService.INSTANCE)
        assert(app2 === CartDao)
    }


    @Test
    fun testApp() {
        var address1 = Address.Builder().street("rue de la paix").city("Paris").build()

        val address = com.sun.models.Address(street = "rue de la paix", city = "Paris")

        assertEquals(address.street, address.street)

    }


    fun `factory method`() {
        val discount = DiscountFactory.create(DiscountType.FIXED)
    }
}


/**
 * Factory method - replace constructor
 * named
 */
object DiscountFactory {
    fun create(type: DiscountType): DiscountStrategy {
        return when (type) {
            DiscountType.FIXED -> DiscountStrategy.fixedRateStrategy(10.0)
            DiscountType.PERCENTAGE -> DiscountStrategy {
                (it.price - 10).coerceAtLeast(0.0)
            }
        }
    }
}

enum class DiscountType {
    FIXED,
    PERCENTAGE,
    ;
}

