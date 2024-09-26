package relationship;


public class Test {
    public static void main(String[] args) {
       /* Person person1 = new Person();
        person1.display();

        Address address2 = new Address("456 First street", "Ambedhkar nagar", "Chennai", "Tamil Nadu", "India", "600025");
        Person person2 = new Person(102, "Indumathi", new MyDate(27, 2, 2000), address2);
        person2.display();
        
        Employee emp1 = new Employee();
        emp1.calculate();
        emp1.display();
        
        Address address2 = new Address("456 First street", "Ambedhkar nagar", "Chennai", "Tamil Nadu", "India", "600025");
        Employee emp2 = new Employee(102, "Indumathi", new MyDate(27, 02, 2002), address2, 20, 2000 );
        emp2.calculate();
        emp2.display(); */
    	
    	SalesPerson salesPerson1 = new SalesPerson();
    	salesPerson1.calculate();
    	salesPerson1.display();
    	
    	Address address2 = new Address("456 First street", "Ambedhkar nagar", "Chennai", "Tamil Nadu", "India", "600025");
    	SalesPerson salesPerson2 = new SalesPerson(102, "Indumathi", new MyDate(27, 02, 2002), address2, 20, 3000, 78);
    	salesPerson2.calculate();
    	salesPerson2.display();
    }
}
