package com.walmart.product;

public class Products {
	 int pid;
	 String pname;
	 double qty;
	 double price;
	 public Products(int pid, String pname, double qty, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public Products() {
	}
	 public void productDetails() {
		 System.out.println("Product Information : ");
		 System.out.println(pid + "\t" + pname + "\t" + qty +"\t" + price);
	 }
	
}
