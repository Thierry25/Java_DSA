
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("Exercise17_01.txt")){
            for(int i = 0; i < 100; i++) printWriter.printf("%d ", (int)(Math.random() * 100));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
