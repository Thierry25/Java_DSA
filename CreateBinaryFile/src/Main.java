import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream("Exercise17_02.dat", true)))){
            for(int i = 0; i < 100; i++) output.writeInt((int) (Math.random() * 100));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
