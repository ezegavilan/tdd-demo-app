package com.gavilan.currency;

<<<<<<< HEAD
import com.gavilan.currency.domain.Money;
import org.junit.Test;

import static org.junit.Assert.*;
=======
import com.gavilan.currency.domain.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 48a899d2bb2a63fe6245dd45a84905bdb43fc8f4

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

}
