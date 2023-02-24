// File Handling

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J_filehandling {
    public static void main(String[] args) throws IOException {

        // Create File
        File myfile = new File("parth.txt");
        myfile.createNewFile();

        // Write File
        FileWriter fw = new FileWriter("parth.txt");
        fw.write("hello parth");
        fw.close();

        // Read File
        File fr = new File("parth.txt");
        Scanner k = new Scanner(fr);
        while (k.hasNextLine()) {
            System.out.printf("%s\n", k.nextLine());
        }
        k.close();

        // Deleting File
        File fd = new File("parth.txt");
        fd.delete();
    }
}
