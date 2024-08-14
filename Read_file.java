import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {

        try {
            FileReader k = new FileReader("ASHISH");
            Scanner input = new Scanner(k);
            while (input.hasNextLine()){
                String data=input.nextLine();
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
