
public class Doctor extends Employee {
	private String specialism;
		Doctor(String name, int emp_no, String specialism)
		{
			this.Name =name;
			this.emp_no= emp_no;
			this.specialism=specialism;
		}
		void sepcialism()
		{
		System.out.println("Doctor  " +Name+ " employ#: " +emp_no+ " specializes in " +specialism);
		}
}
