import java.io.File;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) {

        try {
            File K= new File("ASHISH");
            if (K.createNewFile()){
                System.out.println("THE FILE IS CREATED AS: "+K);
            }
            else{
                System.out.println("file is alrady created");
            }
        }
        catch (IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
