package Database;
import java.io.BufferedReader;
import java.io.FileReader;
public class Databaseoperation {
    public static String FirstName=" ";
    public static String SecondName=" ";
    public static String PostCode=" ";
    public static String customerName=" ";
    public static String FN(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shampriya\\Desktop\\XYZ Bank.csv"));
           //reading text
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return FirstName;
    }
    public static String SN(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shampriya\\Desktop\\XYZ Bank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SecondName;
    }
    public static String PC(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shampriya\\Desktop\\XYZ Bank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return PostCode;
    }

    public static String FullName(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shampriya\\Desktop\\XYZ Bank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return customerName;
    }
}

