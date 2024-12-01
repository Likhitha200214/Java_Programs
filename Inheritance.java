package com.jspiders.inheritance;
class SwiggyV1{
	void orderfood(){
		System.out.println("order biryani");
	}
}
class SwiggyV2 extends SwiggyV1{
	void ordergroceries() {
		System.out.println("order dal");
	}
}
public class Mainclass5 {
    public static void main(String[] args) {
		SwiggyV1 s1=new SwiggyV1();
		s1.orderfood();
		SwiggyV2 s2=new SwiggyV2();
		s2.ordergroceries();
	}
}
