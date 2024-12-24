package homework_day_11;
class Student{
	String name;
	int age;
	Student(String name){
		this.name = name;
	}
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
}
public class q1 {

	public static void main(String[] args) {
		Student s = new Student("sahil");
		Student s2 = new Student("sahil",20);
		s.print();
		s2.print();
	}

}
