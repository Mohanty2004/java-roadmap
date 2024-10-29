public class Car {
	String name;

	void startEngine() {
		System.out.println("engine starting");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Abhisek";
		System.out.println(c.name);
	}
}