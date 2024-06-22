package MainPackage;

public class Employee extends Person {
    private String title;
    private int compensation;

    public Employee(){
        this.title = "Unknown";
        this.compensation = -1;
    }

    public Employee(String Name, String DateOfBirth, Address address, String Title, int Compensation){
        super(Name, DateOfBirth, address);
        this.title = Title;
        this.compensation = Compensation;
    }

    public String GetTitle(){
        return this.title;
    }

    public void SetTitle(String value){
         this.title = value;
    }

    public int GetCompensation(){
        return this.compensation;
    }

    public void SetCompensation(int value){
        this.compensation = value;
    }

    public String GetDetails() {
        String currentAddress = super.GetAddress().toString();
        String details = "\nName: " + this.GetName() + ", \nDOB: " + this.GetDateOfBirth() + ", \nJob Title: " + this.GetTitle() + ", \nCompensation: " + GetCompensation() + ", \nAddress: " + currentAddress;
        return details;

    }
}
