package Subclasses;
import MainPackage.Address;
import MainPackage.Employee;

public class Medic extends Employee{
    private String hospitalName;
    private int licenseNumber;

    public Medic(){
        this.hospitalName = "HospitalName";
        this.licenseNumber = -1;
    }

    public Medic(String Name, String DateOfBirth, Address address, String HospitalName, int LicenseNumber, String Title, int Compensation){
        super(Name, DateOfBirth, address, Title, Compensation);
        this.hospitalName = HospitalName;
        this.licenseNumber = LicenseNumber;
    }

    public String GetHospitalName() {
        return hospitalName;
    }

    public void SetHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int GetLicenseNumber() {
        return licenseNumber;
    }

    public void SetLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String GetAllDetails() {
        String details = "\nName: " + this.GetName() + ", \nDOB: " + this.GetDateOfBirth() + ", \nHospital name: " + this.GetHospitalName() + ", \nLicense No: " + this.GetLicenseNumber() + ", \nJob Title: " + this.GetTitle() + ", \nCompensation: " + GetCompensation() + ", \nAddress: " + this.GetAddress().GetFullAddress();
        return details;
    }

}
