import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage java Copy sourceFile targetFile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("The file does not exist ");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("File already exists");
            System.exit(3);
        }

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))) {
                int r, numberOfBytesCopied = 0;
                while((r = input.read()) != -1){
                    output.write((byte) r);
                    numberOfBytesCopied += 1;
                }

            System.out.printf("There were %d bytes copied\n", numberOfBytesCopied);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
