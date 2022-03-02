package oppsConcept;

public class interfaceEx {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(20, 10, 1);
		System.out.println("Gear is:- " + mb.getGear());
		System.out.println("The speed is:- " + mb.getSpeed());
		System.out.println("The seat height is:- " + mb.getSeatHeight());
		
		mb.applyBrake(5);
		System.out.println("The reduce speed is:- " + mb.getSpeed());
		mb.speedUp(20);
		System.out.println("The increase speed is:- " + mb.getSpeed());
		
	}

}
