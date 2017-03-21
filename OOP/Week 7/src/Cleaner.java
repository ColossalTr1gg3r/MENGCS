
public class Cleaner extends Employee{
	private String dept;
	Cleaner (String Name, int emp_no, String dept)
	{
		this.Name = Name;
		this.emp_no = emp_no;
		this.dept = dept;
	}
	void clean()
	{
		System.out.println("Cleaner  " +Name+ " employ#: " +emp_no+ " of department " +dept+ " is sweeping");
	}
}
