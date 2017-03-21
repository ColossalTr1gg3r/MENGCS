
public class Nurse extends Employee {
	private int patients;
	Nurse(String name, int emp_no, int patients)
	{
		this.Name =name;
		this.emp_no= emp_no;
		this.patients=patients;
	}
	void carePaitents()
	{
	System.out.println("Nurse " +Name+ " employ# " +emp_no+ " has " +patients+" patients");
	}
}
