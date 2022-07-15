
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Errata! Usage Main.java text.txt");
            System.exit(1);
        }
        Set<String> stringSet = new TreeSet<>();
        try{
            File file = new File(args[0]);
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String line = input.nextLine();
                String[] words = line.split(" ");
                stringSet.addAll(Arrays.asList(words));
            }
        }catch (Exception e){
           e.printStackTrace();
        }

        System.out.println(stringSet);

    }
}