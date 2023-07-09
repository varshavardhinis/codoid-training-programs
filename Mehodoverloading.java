package venkat;

public class Mehodoverloading {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(20,30,30));
		//System.out.println(sum(10,20,30,40));
		

	}
	public static int sum(int a,int b) {
		int r=a+b;
		return r;
	}
	public static int sum(int a,int b,int c)
	{
		int r=a+b+c;
		return r;
	}

}
