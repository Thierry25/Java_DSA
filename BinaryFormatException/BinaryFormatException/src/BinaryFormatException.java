public class BinaryFormatException extends Exception{
    public BinaryFormatException(){
        super("Not a Binary number bruuh!");
    }

    public BinaryFormatException(String message){
        super(message);
    }
}
