package com.walmart;

public class Account {
	private int accNo;
	private String accName;
	public Account(int accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}
	public Account() {
	}
		
		public void accDetails(){
			System.out.println("Account Information : ");
			System.out.println(accNo + "\t" + accName);
	}
}
