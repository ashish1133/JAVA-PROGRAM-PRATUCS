package Files;

import java.io.File;

public class Delete_File {

    public static void main(String[] args)throws Exception {

        try {
            File k = new File("ASHISH");
            k.delete();
        }catch (Exception p){
            p.printStackTrace();
        }

    }
}
