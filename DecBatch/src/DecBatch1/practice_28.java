package DecBatch1;

public class practice_28 {

	public int multi(int a,int b)
	{
		int c = a*b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c = a-b;
		return c;
	}
	public int sum(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public int div(int a,int b)
	{
		int c = a/b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice_28 p = new practice_28();
		int FA = p.multi(10, 2);
		System.out.println(FA);
		int sub1 = p.sub(FA, 2);
		System.out.println(sub1);
		int sum1= p.sum(sub1, 2);
		System.out.println(sum1);
		int sub2 = p.sub(sum1, 2);
		System.out.println(sub2);
		int finalamount = p.div(sub2,2);
		System.out.println("Final Amount= "+finalamount);
		System.out.println(((((10+2)+2)-2)*2)/2);

		


		

		
	}

}
