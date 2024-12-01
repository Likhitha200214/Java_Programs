package com.jspiders.methodoverloading;
class Flipkart{
	void payment(){
		System.out.println("COD");
	}
	void payment(String upi) {
		System.out.println("UPI");
	}
	void payment(long card) {
		System.out.println("CARD");
	}
	void payment(String un ,String pwd) {
		System.out.println("Net Banking");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Flipkart ref=new Flipkart();
		ref.payment();
		ref.payment(123412341234L);
		ref.payment("likhitha sbi");
		ref.payment("likhitha","likhitha@123");
	}
}
