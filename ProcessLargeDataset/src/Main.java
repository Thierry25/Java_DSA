import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String URL = "http://liveexample.pearsoncmg.com/data/Salary.txt";
    public static void main(String[] args) throws IOException {
        URL url = new URL(URL);
        Scanner input = new Scanner(url.openStream());
        double assistantSum = 0;
        double associateSum = 0;
        double fullSum = 0;
        int assistantCount = 0;
        int associateCount = 0;
        int fullCount = 0;
        while(input.hasNext()){
            // TODO: REFACTOR CODE, THIS IS BRUTE FORCE SOLUTION
            String line = input.nextLine();
            if(line.contains("assistant")){
                String[] words = line.split(" ");
                assistantSum += Double.parseDouble(words[words.length -1]);
                assistantCount += 1;
            }else if(line.contains("associate")){
                String[] words = line.split(" ");
                associateSum += Double.parseDouble(words[words.length -1]);
                associateCount += 1;
            }else{
                String[] words = line.split(" ");
                fullSum += Double.parseDouble(words[words.length -1]);
                fullCount += 1;
            }
        }
        System.out.printf("""
                The university has %d assistant Professors, the total of their salaries is % 4.2f, and the average is %4.2f
                The university has %d associate Professors, the total of their salaries is % 4.2f, and the average is %4.2f
                The university has %d full Professors, the total of their salaries is % 4.2f and the average is %4.2f\n""", assistantCount, assistantSum, assistantSum/assistantCount,
                associateCount, associateSum, associateSum/assistantCount, fullCount, fullSum, fullSum/fullCount);
    }
}
