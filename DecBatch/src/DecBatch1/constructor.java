package DecBatch1;

public class constructor {
	
	public constructor()
	{
		this(1,2,3);
		System.out.println("default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("one parametrized constructor");
	}
	public constructor(int a,int a1)
	{
		this(1);
		System.out.println("two parametrized constructor");
	}
	public constructor(int a,int a1, int a2)
	{
		System.out.println("three parametrized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	constructor cons = new constructor(1,2);	

	}

}
