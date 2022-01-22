package week1.day1;

public class Student {
	
String name="Devibala";
int rollno=23;

	public static void main(String[] args) {
		Student obj= new Student();
		String stuName=obj.name;
		System.out.println("My name is: " + stuName);
		int number=obj.rollno;
		System.out.println("My rollno is: "+number);
		
		System.out.println("My college name is: " +obj.college());

	}

public String college() {
String collegeName="Mookambigai college of Engg";
return collegeName;
}

}

