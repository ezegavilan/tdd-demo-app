package com.gavilan.currency.domain;

public interface Expression {
    Money reduce(Bank bank, String to);
}
