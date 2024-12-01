interface Shape{
	void draw();
}
class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}
class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}
class ShapeToolKit{
	static void drawShape(Shape s) {
		if(s!=null) {
			s.draw();
		}
	}
}
public class Mainclass6 {
	public static void main(String[] args) {
		Circle c =new Circle();
		ShapeToolKit.drawShape(c);
		Square s=new Square();
		ShapeToolKit.drawShape(s);
		Triangle t=new Triangle();
		ShapeToolKit.drawShape(t);
	}

}
