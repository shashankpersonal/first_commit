package DecBatch1;

public class Arth {
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c = a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c = a*b;
		return c;
	}
	public int div(int a, int b)
	{
		int c = a/b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arth a = new Arth();
		int sum1 = a.sum(10, 2);
		System.out.println(sum1);
		int finalsum = a.sum(sum1,2);
		System.out.println(finalsum);
		int sub1 = a.sub(finalsum, 2);
		System.out.println(sub1);
		int multi = a.mul(sub1, 2);
		System.out.println(multi);
		int finalamount = a.div(multi, 2);
		System.out.println("Final amount= "+finalamount);

	}

}
