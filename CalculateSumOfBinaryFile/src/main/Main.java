package main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(DataInputStream input = new DataInputStream(
                new BufferedInputStream(new FileInputStream("main/Exercise17_02.dat")))){
            int sum = 0;
            int val;
            while((val = input.readInt()) != -1) {
                sum += val;
                System.out.println(val);
            }
            System.out.printf("The sum is %d", sum);
        }catch (IOException ex){
            System.out.println("File not found");
        }
    }
}
