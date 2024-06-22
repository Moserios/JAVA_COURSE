import MainPackage.Address;
import Subclasses.Medic;

public class Main
{
    public static void main(String[] args)
    {
        Address GeorgeAddress = new Address("USA", "TX", "Houston", "Navara", "14b", "1-1", 123456);
        Medic George = new Medic("George McArthur", "1972.07.31", GeorgeAddress, "Primary Hospital", 3543843,"Surgery", 250000);
        //System.out.println(George.GetAddress().GetFullAddress());
        System.out.println(George.GetAllDetails());
    }
}