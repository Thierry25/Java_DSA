import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage java Main Welcome.java Welcome.utf");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("The file does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if(targetFile.exists()){
            System.out.println("The file already exists");
            System.exit(3);
        }

        try(Scanner input = new Scanner(sourceFile);
            DataOutputStream output =
                    new DataOutputStream(new BufferedOutputStream(new FileOutputStream(targetFile)))){
            while(input.hasNext()){
                String line = input.nextLine();
                output.writeUTF(line);
            }
            System.out.println("Done");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
