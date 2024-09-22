public class ClassBasics {
	int x = 5;

    	public static void main(String... args){
		Car c1 = new Car("BMW","Second",3);
		c1.display();
		
	}
}
class Car{
	String name;
	String wheelType;
	int year;
	
	Car(){
	}
	Car(int year){
		this.year = year;
	}
	Car(String name){
		this.name = name;
		System.out.println("From constructor 3");
	}
	Car(String name,String wheelType){
		this(name);
		this.wheelType = wheelType;
		System.out.println("From consturctor 4");
	}
	Car(String name,String wheelType,int year){
		this(name,wheelType);
		this.year = year;
		System.out.println("From consturctor 5");
	}

	void startEngine(){
		System.out.println("Starting Engine");
	}

	void display(){
		System.out.println(name);
		System.out.println(wheelType);
		System.out.println(year);
	}

	
}

