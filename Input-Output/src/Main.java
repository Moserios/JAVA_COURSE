import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Standard input/output
        System.out.println("\nStandard input/output\n");
        //System.err.println("Error print output");
        System.out.println("Standard text output");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value");
        String i = scanner.nextLine();            // Read a line of input from the console
        System.out.println("You entered: " + i);


        //FILE OUTPUT STREAM
        System.out.println("\nFILE OUTPUT STREAM");
        System.out.println("\nByte-oriented output (FileOutputStream class)  and Character-oriented (FileWriter class) data");
        try {
            FileOutputStream fos = new FileOutputStream("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\output.txt");
            System.out.println("Writing to output.txt");
            try {
                fos.write(i.getBytes());
                fos.close();
                System.out.println("Successfully wrote to output.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //FILE INPUT STREAM
        System.out.println("\nFILE INPUT STREAM (reads stream of a raw bytes: image, audio, video etc)"); //
        int input;
        System.out.println("Reading rom output.txt");
        try {
            FileInputStream fin = new FileInputStream("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\output.txt");
            while ((input = fin.read()) != -1){
                System.out.print((char)input);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //FILE WRITER CLASS : used to write to file without conversion
        System.out.println("\nFILE WRITER (write a character-oriented data to file)"); //
        try {
            FileWriter fw = new FileWriter("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\output_fw.txt");
            fw.write(i);
            fw.close();
            System.out.println("\nSaved to output_fw.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //FILE READER CLASS : used to read byte data from file
        System.out.println("\nFILE READER (used to read byte data from file like FileInputStream)"); //
        try {
            FileReader fr = new FileReader("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\output_fw.txt");
            int input_fr = 0;
            while ((input_fr = fr.read()) != -1){
                System.out.print((char)input_fr);
            };
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //PrintWriter CLASS : used to write formatted text to a character-output stream
        System.out.println("\nPrintWriter CLASS : used to write formatted text to a character-output stream");
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\output_fw.txt"));
            pw.println("This is a new line saved by PrintWriter");
            pw.println("This is a second line saved by PrintWriter");
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //BufferReader class
        System.out.println("\nBufferReader class: used to read large files of text from character-input stream and " +
                "later read from the buffer instead of input stream");
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\input_br.txt"));
            try {
                String line = br.readLine();
                while (line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //Serialization class
        System.out.println("\nSerialization class: used to convert an object into a string(serialized state)");
        //Transient keyword in Serialisation
        System.out.println("Transient keyword in Serialisation: used to avoid serialization of the object member");
        Address empAddress = new Address("Belgrade", "Vladana Desnice", "100a", "10b");
        Employee emp1 = new Employee("Sergey Moser", empAddress,"15.10.1989", 185, 100, 12345, "myLogin", "myPassword12345");

        try {
            FileOutputStream fout = new FileOutputStream("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\serialized.obj");
            try {
                ObjectOutputStream objOut = new ObjectOutputStream(fout);
                objOut.writeObject(emp1);
                objOut.close();
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Deserialization class
        System.out.println("\nDeserialization class: used to reconstruct the object from a string (serialized state)");
        Employee emp2;
        try {
            FileInputStream fin = new FileInputStream("D:\\_REPOSITORIES\\JAVA_COURSE\\Input-Output\\serialized.obj");
            ObjectInputStream objIn = new ObjectInputStream(fin);
            emp2 = (Employee) objIn.readObject();
            fin.close();
            objIn.close();
            System.out.println("Employee " +
                    "\n name: " + emp2.name +
                    "\n address: " + emp2.address.city + ", " + emp2.address.street + ", " + emp2.address.building + ", " + emp2.address.appartment +
                    "\n DOB: " + emp2.DOB +
                    "\n height: " + emp2.height +
                    "\n weight: " + emp2.weight +
                    "\n id: " + emp2.id +
                    "\n login: " + emp2.login +
                    "\n password: " + emp2.password);
        }
         catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}