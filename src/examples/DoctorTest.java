package examples;

public class DoctorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralPractitioner gp1 = new GeneralPractitioner("Stefan", 32);
		Surgron s1 = new Surgron("Ivana", 38);
		gp1.doMedicine();
		gp1.makeHouseCalls();
		s1.doMedicine();
		s1.performSurgery();

	}

}
