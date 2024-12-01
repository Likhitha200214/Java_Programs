package com.jspiders.methodoverriding;
class AdobeFree{
	void feature() {
		System.out.println("view");
	}
}
class AdobePaid extends AdobeFree{
	@Override
	void feature() {
		System.out.println("view-convert");
	}
}
public class Mainclass6 {
	public static void main(String[] args) {
		AdobeFree af;
		af=new AdobeFree();
		af.feature();
		
		af=new AdobePaid();
		af.feature();
	}
}
