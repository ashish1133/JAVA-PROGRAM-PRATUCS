package Files;

import java.io.FileWriter;

public class Write_file {

    public static void main(String[] args)throws Exception {

        try {
            FileWriter k = new FileWriter("ASHISH");
            k.write("Hi Ashish how are you");
            k.close();
        }catch (Exception p){
            System.out.println(p);
        }
    }

}
