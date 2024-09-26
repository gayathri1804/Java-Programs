package relationship;

public class Employee extends Person {
	double workingDays, perDay, salary;
	
	public Employee()
	{
		super();
		workingDays = 25;
		perDay = 2000;
	}
	public Employee(int id, String name, MyDate dob, Address address, double workingDays, double perDay)
	{
	    super(id, name, dob, address);
	    this.workingDays = workingDays;
	    this.perDay = perDay;
	}
	
	public void calculate() {	
		salary = workingDays * perDay;
	}
	
	public void display() {
		super.display();
		System.out.println("Working Days:"+workingDays);
		System.out.println("Per Day Salary:"+perDay);
		System.out.println("Salary:"+salary);
	}

}