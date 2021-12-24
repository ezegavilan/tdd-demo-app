package com.gavilan.currency.domain;

import java.util.Hashtable;

public class Bank {

    private final Hashtable<Pair, Float> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, float rate) {
        rates.put(new Pair(from, to), rate);
        rates.put(new Pair(to, from), (float) 1/rate);
    }

    public float rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}
