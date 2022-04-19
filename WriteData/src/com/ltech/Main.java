package com.ltech;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        File file = new File("scores2.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print("John K Smith ");
            output.println(90);
            output.print("Liu Kang Shua ");
            output.println(85);
        }

        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        input.close();
    }
}
