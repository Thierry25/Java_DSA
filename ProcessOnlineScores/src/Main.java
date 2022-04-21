import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    private static final String URL = "http://liveexample.pearsoncmg.com/data/Scores.txt";
    public static void main(String[] args) {
        try{
            URL url = new URL(URL);
            Scanner input = new Scanner(url.openStream());
            double sum = 0;
            int count = 0;
            while(input.hasNext()){
                sum += input.nextDouble();
                count += 1;
            }
            System.out.printf("There were %d scores, their total is  %4.2f and their average is %4.2f\n", count, sum, sum / count);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
