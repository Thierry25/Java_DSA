public class HexFormatException extends Exception{
    public HexFormatException(){
        super("Not a hex character bruh!");
    }

    public HexFormatException(String message){
        super(message);
    }
}