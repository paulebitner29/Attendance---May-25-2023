

public class U_2_Spy_Plane extends Vehicle {
	/* b.) Create a subclass of Plane class and name it U-2 Spy Plane,
	 * which has the following properties and methods (wing span and method fly());*/
	
	String Name = "U-2 Spy Plane";
	String WingSpan = "31 meters";
	
	void Fly() {
		System.out.println("Take off!");
	}

	@Override
	void Stop() {
		System.out.println("Touch down! - override the stop method from the super class.");
//		super.Stop();
	}
	
}
