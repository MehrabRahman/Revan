package com.revature.accounts;

public interface InnerAccount {
    void deposit(long amount);
    @Deprecated
    String getName();
    long getAmount();
    void setAmount(long amount);
}