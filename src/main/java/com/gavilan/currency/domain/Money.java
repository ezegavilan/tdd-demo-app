package com.gavilan.currency.domain;

public class Money implements Expression {
    protected float amount;
    protected String currency;

    public Money(float amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return this.currency;
    };

    public float amount() {
        return this.amount;
    }

    @Override
    public Expression times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        float rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public static Money dollar(float amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(float amount) {
        return new Money(amount, "CHF");
    }

    public static Money ars(float amount) {
        return new Money(amount, "ARS");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
