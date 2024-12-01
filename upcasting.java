class Product{
	
}
class Mobile extends Product{
	
}
class Television extends Product{
	
}
class Book extends Product{
	
}
class Flipkart{
	static void addToCart(Product p) {
		System.out.println("products added");
	}
}
public class Mainclass7 {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Television t=new Television();
		Book b=new Book();
		
		Flipkart.addToCart(m);
		Flipkart.addToCart(t);
		Flipkart.addToCart(b);	
	}
}
