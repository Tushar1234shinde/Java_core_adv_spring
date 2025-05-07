package com.get_set.bank;

public class getter_setter_bank {
	int acc_no;
	String accHolder_name;
	double balance;
	String bank_name;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getAccHolder_name() {
		return accHolder_name;
	}
	public void setAccHolder_name(String accHolder_name) {
		this.accHolder_name = accHolder_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	public void display() {
		System.out.println("getter_setter_bank [acc_no=" + acc_no + ", accHolder_name=" + accHolder_name + ", balance=" + balance
				+ ", bank_name=" + bank_name + "]");
	}
	
	
}
