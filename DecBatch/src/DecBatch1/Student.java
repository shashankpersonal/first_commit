package DecBatch1;

public class Student {
	
	int rollNo;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy"); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.display1();
		s1.display2();
		s1.age = 11;
		s1.rollNo = 11;
		System.out.println(s1.age);
		System.out.println(s1.rollNo);

	}

}
