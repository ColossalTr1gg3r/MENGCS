
public class Management extends Employee{
	Management (String Name, int emp_no)
	{
		this.Name = Name;
		this.emp_no = emp_no;
	}
	void manager()
	{
		System.out.println("Human Resources Manager  " +Name+ " employ#: " +emp_no+ " looks after his employees");
	}
}
