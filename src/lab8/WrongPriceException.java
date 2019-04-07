package lab8;

public class WrongPriceException extends RuntimeException {
    public WrongPriceException(){

    }
    public WrongPriceException(String message){
        super(message);
    }
}
