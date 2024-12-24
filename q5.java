package homework_day_11;
class Car{
	private String Cname;
	private String Mname;
	private String year;
	private double milage;
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	
}
public class q5 {

	public static void main(String[] args) {
		Car c = new Car();
		c.setCname("Mahindra");
		c.setMname("Thar");
		c.setYear("2022");
		c.setMilage(14);
		System.out.println("comapny name is : "+c.getCname());
		System.out.println("modal name is : "+c.getMname());
		System.out.println("year is : "+c.getYear());
		System.out.println("milage is : "+c.getMilage());
	}

}
