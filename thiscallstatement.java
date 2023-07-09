package venkat;

public class thiscallstatement {
	thiscallstatement()
	{
		this(1);
		System.out.print("emotion");
	}
	thiscallstatement(int a)
	{
		this(1,2);
		System.out.print("is an ");
	}
	thiscallstatement(int a,int b)
	{
		System.out.print("RCB ");
	}

	public static void main(String[] args) {
		new thiscallstatement();
		
	}

}
