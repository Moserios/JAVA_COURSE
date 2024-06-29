import java.io.Serializable;

public class Employee implements Serializable {
    Address address;
    String name;
    String DOB;
    int height;
    int weight;
    int id;
    boolean gender;
    transient String login; // won't be serialized because of "transient" keyword
    transient String password;// won't be serialized because of "transient" keyword

    public Employee(String name, Address address, String DOB, int height, int weight, int id, String login, String password){
        this.name = name;
        this.address = address;
        this.DOB = DOB;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.login = login;
        this.password = password;
    }




}
