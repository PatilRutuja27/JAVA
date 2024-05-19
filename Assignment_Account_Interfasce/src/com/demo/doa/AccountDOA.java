package com.demo.doa;
import java.util.Vector;
import com.demo.bean.Account;

public class AccountDOA implements IAccount{
	//static Account [] AccountArr;
	static Vector <Account> AccVector=new Vector<> ();
	
	
	@Override
	public boolean AddAcc(Account a) {
		//AccVector.add(a);
		if(AccVector.add(a)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public Vector<Account> DisplayAllAcc() {
		
		return AccVector;
	}
	@Override
	public Vector<Account> getByName(String name) {
		Vector<Account> searchByName=new Vector<>();
		for(Account a:AccVector) {
			if(a.getName().equalsIgnoreCase(name)) {
				searchByName.add(a);
			}
		}
		return searchByName;
	}
	@Override
	public Account getByAccNum(int accNum) {
		for(Account a:AccVector) {
			if(a.getAccountNum()==accNum) {
				return a;
				
			}
		}
		return null;
	}
	@Override
	public boolean modifyBalance(int accNum, int balance) {
		Account acc=getByAccNum(accNum);
		if(acc!=null) {
			acc.setIntrestRate(balance);
			return true;
		}
		return false;
	}
	
	
	
}
