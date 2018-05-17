package BasicJavaProgramming;

public class Car {
	
	String name;
	public Car(String name) {
		this.name = name;
	}
	
	
	//getters
	public String getName() {
		return this.name;
		
	}
	
	public void start() {
		System.out.println("Car started!");
	}

}
