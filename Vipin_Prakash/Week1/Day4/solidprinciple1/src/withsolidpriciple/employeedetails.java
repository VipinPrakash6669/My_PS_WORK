package withsolidpriciple;

public class employeedetails {

	String employeeid;
	String employeename;
	String employeeaddress;
	String employeecontact;
	
	public void saveemployee()
	{
		employeerepository e =new employeerepository();
		e.save(this);
	}
	public void taxcalculator()
	{
		employeetaxcalculator et =new employeetaxcalculator();
		et.taxcalculator(this);
	}
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public String getEmployeecontact() {
		return employeecontact;
	}
	public void setEmployeecontact(String employeecontact) {
		this.employeecontact = employeecontact;
	}
}
