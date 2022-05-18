import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream output = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("Exercise17_05.dat")))){
            int[] values = {1,2,3,4,5};
            Date today = new Date();
            double val = 5.5;

            output.writeObject(values);
            output.writeObject(today);
            output.writeDouble(val);

            System.out.println("Done");
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try(ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("Exercise17_05.dat")))){
            int[] savedValues = (int[]) (input.readObject());
            Date savedDate = (Date) (input.readObject());
            double savedVal = input.readDouble();

            System.out.println("The int[] stored is " +  Arrays.toString(savedValues));
            System.out.println("The date stored is " +  savedDate);
            System.out.println("The saved double " +  savedVal);
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
