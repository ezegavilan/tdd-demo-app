package com.gavilan;

import com.gavilan.currency.domain.Bank;
import com.gavilan.currency.domain.Money;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Money ars = Money.ars(7775);
        Money arsToDollars;

        Bank bank = new Bank();
        bank.addRate("ARS", "USD", 102.23f);

        arsToDollars = bank.reduce(ars, "USD");
        System.out.println(arsToDollars);
    }
}
