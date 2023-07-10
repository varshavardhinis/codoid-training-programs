package programs;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		
		if((ch<='a'&& ch>='z')||(ch<'A' && ch >='z'))
		{
		switch(ch)
		 {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("it is vowel");
				break;
			default:
					System.out.println("it is consonent");
		}

	}
	}}
	


