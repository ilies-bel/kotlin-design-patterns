package com.takima;

import com.moon.CartService
import com.moon.models.Address
import com.sun.persistence.CartDao
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
}

