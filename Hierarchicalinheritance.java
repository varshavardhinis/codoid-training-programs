package venkat;
class a{
	void input()
	{
		System.out.println("enter ur name ");
	}
}
class b extends a
{
	void show()
	{
		System.out.println("my name is venkat");
	}
}
class c extends a{
	void display()
	{
		System.out.println("my is palanivel");
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		b b1=new b();
		b1.input();
		b1.show();
		c c1=new c();
		c1.input();
		c1.display();
		

	}

}
