import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProperties {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Errata! Usage: java FileProperties Welcome.java");
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println(sourceFile + " does not exist");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(sourceFile);
        ) {
            int charactersCount = 0;
            int lineCount = 0;
            int wordCount = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                if(line.length() > 0) lineCount += 1;
                wordCount += line.split(" ").length;
                charactersCount += line.length();
            }
            System.out.printf("File %s\n", sourceFile.getName());
            System.out.printf("%s characters\n", charactersCount);
            System.out.printf("%s words\n", wordCount);
            System.out.printf("%s lines\n", lineCount);
        }
        // We need word count, characters count and line count

    }
}
