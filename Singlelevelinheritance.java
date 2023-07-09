package venkat;
class superclass{
	void hercules() {
		System.out.println("it is an hercules");
	}
}
class child extends superclass{
	void hero() {
		System.out.println("it is an hero");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		child c1=new child();
		c1.hercules();
	

	}

}
