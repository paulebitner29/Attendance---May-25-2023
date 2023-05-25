
public class Test_Class {

	public static void main(String[] args) {
		
		//instantiate new object for car.
		 Toyota_VIOS car = new Toyota_VIOS();
		 
		 car.Drive();
		 
		 car.Speed = "100 kph";
		 car.Color = "Red";
		 car.Price = "P 900, 000. 00";
		 System.out.println("Car Name: " + car.Name);
		 System.out.println("Speed: " + car.Speed);
		 System.out.println("Color: " + car.Color);
		 System.out.println("Tire Type: " + car.TireType);		 
		 System.out.println("Price: " + car.Price);
		 
		 car.Stop();
		 
		 System.out.println("\n=================================================================\n");
		 
		//instantiate new object for plane.
		 U_2_Spy_Plane plane = new U_2_Spy_Plane();
		 
		 plane.Fly();
		 
		 plane.Speed = "900 kph";
		 plane.Color = "Black";
		 plane.Price = "P 900, 000, 000. 00";
		 System.out.println("Plane Name: " + plane.Name);		 
		 System.out.println("Speed: " + plane.Speed);
		 System.out.println("Color: " + plane.Color);
		 System.out.println("Wing Span: " + plane.WingSpan);		 
		 System.out.println("Price: " + plane.Price);
		
		 plane.Stop();

		 System.out.println("\n=================================================================\n");
		 
		//instantiate new object for boat.
		 Fandango_Yacht boat = new Fandango_Yacht();
		 
		 boat.Float();
		 
		 boat.Speed = "18 km";
		 boat.Color = "Yellow";
		 boat.Price = "P 29, 000, 000, 000. 00";
		 System.out.println("Boat Name: " + boat.Name);		 
		 System.out.println("Speed: " + boat.Speed);
		 System.out.println("Color: " + boat.Color);
		 System.out.println("Mainsail Color: " + boat.MainsailColor);		 
		 System.out.println("Price: " + boat.Price);
		 
		 boat.Stop();
		 
	}

}
