package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Errata! Usage java ReplaceText file.txt oldString newString");
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(2);
        }

        try (
                Scanner input = new Scanner(file);
        ) {

            StringBuilder stringBuilder = new StringBuilder();
            while(input.hasNext()){
                // If we want to be case-insensitive
                String line = input.nextLine().toLowerCase();
                String newString = line.replaceAll(args[1].toLowerCase(), args[2]) + "\n";
                stringBuilder.append(newString);
            }
            PrintWriter output = new PrintWriter(file);
            output.print(stringBuilder);
            output.close();
        }

    }
}
