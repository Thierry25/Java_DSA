package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText word file");
            throw new ArrayIndexOutOfBoundsException();
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(file);
        ) {
            output.println("John is my friend");
            output.println("He is 35 years old");
            output.println("He has a son John Jr");
            output.println("It seems like they really like the name John");

            while(input.hasNext()){
                String s = input.nextLine();
                output.print(s.replaceAll(args[0], ""));
                System.out.println(s);
            }
        }
    }

}