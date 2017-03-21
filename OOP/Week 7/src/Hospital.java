
public class Hospital {

	public static void main(String[] args) {
		Doctor d1= new Doctor("Ben", 3234, "Orthopedic");
			d1.sepcialism();
		Cleaner c1 = new Cleaner ("Rejin", 4503, "Human Resources");
			c1.clean();
		Nurse n1 =new Nurse ("Nathan", 4054,5);
			n1.carePaitents();
		receptionist r1 = new receptionist("Pogba", 3454);
			r1.reception();
		Management m1 = new Management("Simon",1000);
			m1.manager();
	}

}
