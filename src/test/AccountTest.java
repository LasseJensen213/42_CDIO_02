package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import game.Account;
public class AccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getBalancetest() {
		Account account = new Account(5);
		int expected = 5;
		int actual = account.getBalance();
		assertEquals(expected,actual);
		
	}

	@Test 
	public void setBalancetest() {
		int expected = 20;
		Account account = new Account(10);
		account.setBalance(expected);
		int actual = account.getBalance();
		assertEquals(expected,actual);
	}
}
