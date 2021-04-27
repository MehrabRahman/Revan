package com.revature.accounts;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {
  @Test
  public void evaluatesExpression() {
    Account account = new Account("checking", 100);
    long balance = account.getAmount();
    assertEquals(100, balance);
  }
}