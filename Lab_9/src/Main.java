import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("C:\\Codes\\SOOP\\Lab_9\\src\\ecdc_covid19_cases.csv"));
            System.out.println(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
