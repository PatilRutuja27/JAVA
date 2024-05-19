package com.demo.doa;

import java.util.Vector;

import com.demo.bean.Account;

public interface IAccount {
	
	boolean AddAcc(Account a);
	Vector<Account> DisplayAllAcc();
	Vector<Account> getByName(String name);
	Account getByAccNum(int accNum);
	boolean modifyBalance(int accNum, int balance);
	
}
