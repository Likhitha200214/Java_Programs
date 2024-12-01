package com.jspiders.consoverloading;
class Whatsapp1{
	void message() {
		System.out.println("sending message");
	}
}
class Whatsapp2 extends Whatsapp1 {
	void call() {
		System.out.println("make a call");
	}
}
class Whatsapp3 extends Whatsapp2 {
	void story() {
		System.out.println("Posting a story");
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		Whatsapp1 w1=new Whatsapp1();
		Whatsapp2 w2=new Whatsapp2();
		Whatsapp3 w3=new Whatsapp3();
		w1.message();
		w2.call();
		w3.story();
	}

}
