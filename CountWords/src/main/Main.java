package main;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
        try (
                Scanner input = new Scanner(url.openStream());
        ) {
            int wordCount = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                wordCount += line.split(" ").length;
            }
            System.out.printf("The provided file has %d words in it\n", wordCount);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
