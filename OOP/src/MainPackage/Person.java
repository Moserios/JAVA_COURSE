package MainPackage;

public class Person implements Human{
    private String name;
    private String dateOfBirth;
    Address address;


    Person(){
        this.name = "Unknown";
        this.dateOfBirth = "Unknown";
    }

    Person(String Name, String DateOfBirth, Address address){
        this.name = Name;
        this.dateOfBirth = DateOfBirth;
        this.address = address;
    }

    public String GetName()
        {
        return this.name;
    }

    public void SetName(String value)
    {
        this.name = value;
    }


    public String GetDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public void SetDateOfBirth(String value)
    {
        this.dateOfBirth = value;
    }

    public Address GetAddress(){
        return this.address;
    }

    public void SetAddress(Address address){
        this.address = address;
    }
}
