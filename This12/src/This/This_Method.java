package This;

public class This_Method {
	
	public void method1()
	{
		System.out.println("Default Method");
	}
	public void method1(int a)
	{
		System.out.println("one parameterized Method");
	}
	public void method1(int a,int b)
	{
		System.out.println("Two parameterized Method");
	}
	public void method1(int a,int b,int c)
	{
		System.out.println("Three parameterized Method");
		this.method1();
		this.method1(1);
		this.method1(a, b, c, c);
		this.method1(a, b);
	}
	public void method1(int a,int b,int c,int d)
	{
		System.out.println("four parameterized Method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Method q = new This_Method();
		q.method1(1, 2, 3);
	}

}
