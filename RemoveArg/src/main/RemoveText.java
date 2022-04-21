package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 2){
            System.out.println("Errata! Usage java RemoveText word filename");
        }

        File file = new File(args[1]);
        if(!file.exists()){
            System.out.println("File does not exist");
            System.exit(2);
        }

        try(
                Scanner input = new Scanner(file);
                ){
            StringBuilder stringBuilder = new StringBuilder();
            while(input.hasNext()){
                String line = input.nextLine();
                String s1 = line.replaceAll(args[0], "") + "\n";
                stringBuilder.append(s1);
            }

            PrintWriter output = new PrintWriter(file);
            output.print(stringBuilder);
            output.close();
        }
    }
}
