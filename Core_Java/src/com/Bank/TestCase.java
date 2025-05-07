package com.Bank;

public class TestCase {

	public static void main(String[] args) {
		Account a1,a2,a3;
		a1=new Account();
		a1.setAccNo(347667674);
		a1.setOwnername("tushar");
		a1.setBalance(2500);
		
		a1.showAccount();
	}

}
