package relationship;

public class SalesPerson extends Employee {
    
    double commission, sales, totalSalary;
    
    public SalesPerson() 
    {
        super();
        sales = 85;
    }
    
    public SalesPerson(int id, String name, MyDate dob, Address address, double workingDays, double perDay, double sales) {
        super(id, name, dob, address, workingDays, perDay);
        this.sales = sales;
    }
    
    @Override
    public void calculate() {
        super.calculate();
        
        if(sales >= 90)
            commission = salary * 0.2;
        else if(sales >= 75)
            commission = salary * 0.1;
        else if(sales >= 60)
            commission = salary * 0.05;
        else
            commission = 0;
        
        totalSalary = salary + commission;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Sales: " + sales);
        System.out.println("Commission"+commission);
    }
}
