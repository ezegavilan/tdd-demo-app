package com.gavilan.currency.domain;

public interface Expression {
    Money reduce(String to);
}
