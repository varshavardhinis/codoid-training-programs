package programs;

public class fabnosisseries {

	public static void main(String[] args) {
		int num=7;
		int f=1;
		int s=1;
		int t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=num;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
		

		
	}

}
