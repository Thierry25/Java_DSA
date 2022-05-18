import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       if(args.length != 1){
           System.out.println("Errata Main filename");
           System.exit(1);
       }

       try{
           File f = new File(args[0]);
           Scanner input = new Scanner(f);
           List<String> words = new ArrayList<>();
           while(input.hasNext()){
               words.add(input.next());
           }
           Collections.sort(words);
           System.out.println(words);

       }catch (Exception e){
           e.printStackTrace();
       }
    }

}