package relationship;

public class Address {
    String addrLine;
    String street;
    String city;
    String state;
    String country;
    String pincode;
    
    public Address() {
        addrLine = "9B-Second Street";
        street = "Chockanathar kovil street";
        city = "Nagapattinam";
        state = "Tamil Nadu";
        country = "India";
        pincode = "611001";
    }
    
    public Address(String addrLine, String street, String city, String state, String country, String pincode) {
        this.addrLine = addrLine;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
    
    public void display() {
        System.out.println("Address Line: " + addrLine);
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Pincode: " + pincode);
    }
}
