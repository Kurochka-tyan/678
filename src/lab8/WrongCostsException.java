package lab8;

public class WrongCostsException extends RuntimeException{
    public WrongCostsException(){

    }
    public WrongCostsException(String message){
        super(message);
    }
}
