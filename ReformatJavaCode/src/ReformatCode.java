import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java ReformatCode x.java");
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println(sourceFile + " does not exist");
            System.exit(2);
        }

        try (Scanner input = new Scanner(sourceFile);
        ) {
            StringBuilder stringBuilder = new StringBuilder();
            while(input.hasNext()){
                String line = input.nextLine();
                String s1 = line.trim();
                if(s1.charAt(0) == '{'){
                    stringBuilder.append(" {");
                    if(s1.length() > 1) stringBuilder.append("\r\n").append(line.replace('{', ' '));
                }else stringBuilder.append("\r\n").append(line);
            }
            PrintWriter output = new PrintWriter(sourceFile);
            output.print(stringBuilder.toString());
            output.close();
        }
    }
}
