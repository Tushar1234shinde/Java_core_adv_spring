package com.Bank;

public class Account {
int accNo;
String ownername;
double balance;
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public void showAccount() {
	System.out.println("Account [accNo=" + accNo + ", ownername=" + ownername + ", balance=" + balance + "]");
}


}
