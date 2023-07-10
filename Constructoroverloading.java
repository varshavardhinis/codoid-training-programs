package varsha;
class bike{
	int price;
	String name;
	String fuelcapacity;
	bike(){
		
	}
	bike(int price)
	{
		this.price=price;
	}
	bike(String name){
		this.name=name;
	}
	public void display() {
		System.out.println("bike name is "+name);
		System.out.println("bike price is "+price);
	}
	
}


public class Constructoroverloading {

	public static void main(String[] args) {
		bike b1=new bike();
b1.display();
bike b3=new bike(10000);
b3.display();
bike b2=new bike("yamaha");
b2.display();

	}

}
