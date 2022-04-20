import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessScore {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 1) System.out.println("Errata! Usage: java ProcessScore scores.txt");

        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println(sourceFile + " does not exist");
            System.exit(2);
        }
        Scanner input = new Scanner(sourceFile);
        double sum = 0;
        int count = 0;
        while(input.hasNext()){
            sum += input.nextDouble();
            count += 1;
        }
        System.out.printf("The sum is %s and the average is %4.2f", sum, sum / count);
    }
}
