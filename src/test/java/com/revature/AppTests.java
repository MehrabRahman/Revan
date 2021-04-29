package com.revature;

import com.revature.accounts.AccountTest;
import com.revature.accounts.BasicTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses({AccountTest.class, BasicTest.class })
public class AppTests {

}