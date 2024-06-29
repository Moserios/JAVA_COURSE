import java.io.Serializable;

public class Address implements Serializable {
    int zipcode = -1;
    String country;
    String state;
    String city;
    String street;
    String building;
    String appartment;

    public Address(String city, String street, String building, String appartment){
        this.city = city;
        this.street = street;
        this.building = building;
        this.appartment = appartment;

    }

}
