package com.accountant;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;
    private String currency;

    public Account(String name, BigDecimal balance, String currency) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;

    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
