
public class Toyota_VIOS extends Vehicle {
	
	/*  a.) Create a subclass of Car class and name it Toyota-VIOS,
	 *  which has the following properties and methods (tire type and method drive());*/
	
	String Name = "Toyota-Vios";
	String TireType = "All Season";
	
	void Drive() {
		System.out.println("Accelerate!");
	}

	@Override
	void Stop() {
		System.out.println("Car stopped! - override the stop method from the super class."); 
//		super.Stop();
	}
	
}
