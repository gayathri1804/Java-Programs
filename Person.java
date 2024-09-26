package relationship;

public class Person {
    int id;
    String name;
    MyDate dob;
    Address address;
    
    public Person() {
        id = 101;
        name = "Gayathri";
        dob = new MyDate();
        address = new Address();
    }
    
    public Person(int id, String name, MyDate dob, Address address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        dob.display();
        address.display();
    }
}
