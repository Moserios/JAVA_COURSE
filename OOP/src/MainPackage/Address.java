package MainPackage;

public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String building;
    private String appartment;
    private int postalCode;

    public Address(){
        this.country = "Unknown";
        this.state = "Unknown";
        this.city = "Unknown";
        this.street = "Unknown";
        this.building = "Unknown";
        this.appartment = "Unknown";
        this.postalCode = -1;
    }


    public Address(String Country, String State,String City,String Street, String Building, String Appartment, int PostalCode){
        this.country = Country;
        this.state = State;
        this.city = City;
        this.street = Street;
        this.building = Building;
        this.appartment = Appartment;
        this.postalCode = PostalCode;
    }

    public String GetFullAddress(){
        String fullAddress = "\n PostalCode: " + this.GetPostalCode() + ", \n Country: " + this.GetCountry() + ", \n State: " + this.GetState() + ", \n City: " + this.GetCity() + ", \n Street: " + this.GetStreet() + ", \n Building: " + this.GetBuilding() + ", \n Appartment: " + this.GetAppartment();
        return fullAddress;
    }

    public void SetCountry(String value){
        this.country = value;
    }
    public String GetCountry(){
        return this.country;
    }


    public void SetState(String value){
        this.state = value;
    }

    public String GetState(){
        return this.state;
    }

    public void SetCity(String value){
        this.city = value;
    }

    public String GetCity(){
        return this.city;
    }

    public void SetStreet(String value){
        this.street = value;
    }

    public String GetStreet(){
        return this.street;
    }

    public void SetBuilding(String value){
        this.building = value;
    }

    public String GetBuilding(){
        return this.building;
    }

    public void SetAppartment(String value){
        this.appartment = value;
    }

    public String GetAppartment(){
        return this.appartment;
    }

    public void SetPostalCode(int value){
        this.postalCode = value;
    }

    public int GetPostalCode(){
        return this.postalCode;
    }
}
