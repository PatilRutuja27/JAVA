package com.demo.test;
import com.demo.beans.*;
public class AccountTest {

	public static void main(String[] args) {
		Account ac= AccountService.getObj();
		AccountService.getService(ac);
	}

}
