package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.accounts.InnerAccount;
import com.revature.accounts.Account;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        InnerAccount account = new Account("checking", 100);
        if (account.getAmount() != 5); // Empty if warning
        logger.info("Getting account");
        // Deprecated method warning
        logger.debug(account.getName() + " account:" + " $" + account.getAmount());
        logger.error("Goodbye");
    }
}
