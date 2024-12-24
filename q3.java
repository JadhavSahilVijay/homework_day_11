package homework_day_11;
class Rectangle{
	private double length;
	private double width;
	
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() { 
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
}
public class q3 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(30);
		System.out.println("area of rectangle is : "+(r.getLength()+r.getWidth()));
	}

}
