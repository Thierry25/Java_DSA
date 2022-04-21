package main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] rank = {"assistant", "associate", "full"};
        File dataset = new File("dataset.txt");
        if(dataset.exists()){
            System.out.println("File already exists");
            System.exit(2);
        }
        try(PrintWriter output = new PrintWriter(dataset)){
            for(int i = 1; i < 1001; i++){
                int value = generateRandomRank(rank);
                String rankFound = rank[value];
                double salaryGenerated = generateRandomSalary(value);
                output.printf("FirstName%d ", i);
                output.printf("LastName%d ", i);
                output.printf("%s ", rankFound);
                output.printf("%4.2f\n", salaryGenerated);
            }
            // If file already exists
            //Scanner input = new Scanner(new File("dataset.txt"));
            Scanner input = new Scanner(dataset);
            while(input.hasNext()){
                System.out.println(input.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int generateRandomRank(String[] arr){
        return (int)(Math.random() * arr.length);
    }

    public static double generateRandomSalary(int value) throws Exception {
        double random = new Random().nextDouble();
        int assistantMin = 50_000;
        int assistantMax = 80_000;
        int associateMin = 60_000;
        int associateMax = 110_000;
        int fullMin = 75_000;
        int fullMax = 130_000;
        return switch (value) {
            case 0 -> assistantMin + (random * (assistantMax - assistantMin));
            case 1 -> associateMin + (random * (associateMax - associateMin));
            case 2 -> fullMin + (random * (fullMax - fullMin));
            default -> throw new Exception("Not a valid value");
        };

    }
}
