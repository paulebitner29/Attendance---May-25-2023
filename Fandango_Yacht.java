
public class Fandango_Yacht extends Vehicle {
	/* c.) Create a subclass of Boat class and name it Fandango Yacht,
	 * which has the following properties and methods (MainSail color and method float());*/
	
	String Name = "Fandango Yacht";
	String MainsailColor = "Green";
	
	void Float() {
		System.out.println("Boat floating!");
	}

	@Override
	void Stop() {
		System.out.println("Drop anchor! - override the stop method from the super class.");
//		super.Stop();
	}

	
}
