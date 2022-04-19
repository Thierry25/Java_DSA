package com.ltech;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Please enter a URL: ");
        String urlString = new Scanner(System.in).next();
        try{
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.printf("%s has %d characters\n", urlString, count);
        }catch(MalformedURLException ex){
            System.out.println("Invalid URL");
        }catch (IOException ex){
            System.out.println("No such file");
        }
    }
}
