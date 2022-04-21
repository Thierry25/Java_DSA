import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Errata! Usage java Sorted.java file");
        }
        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println(args[0] + " does not exist");
            System.exit(2);
        }

        try(
                Scanner input = new Scanner(file);
                ){
            double testSort = 0;
            int count = 0;
            ArrayList<Double> arrayList = new ArrayList<>();
            while(input.hasNext()){
                double data = input.nextDouble();
                if (count == 0) testSort = data;
                if(data >= testSort) testSort = data;
                else{
                    arrayList.add(testSort);
                    arrayList.add(data);
                    break;
                }
                count += 1;
            }
            if (arrayList.size() > 0) {
                System.out.println("Document not sorted, first two non-sorted elements are " + arrayList);
            } else {
                System.out.println("Document sorted");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
