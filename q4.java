package homework_day_11;
class Circle{
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calulateArea() {
		return 3.14*radius*radius;
	}
	public double circumference() {
		return 2*3.14*radius;
	}
	
}
public class q4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);
		double a = c.calulateArea();
		double cf = c.circumference();
		System.out.println("area of circle is : "+a);
		System.out.println("circumference of circle is : "+cf);

	}

}
