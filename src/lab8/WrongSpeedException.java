package lab8;

public class WrongSpeedException extends RuntimeException {
    public WrongSpeedException(){

    }
    public WrongSpeedException(String message){
        super(message);
    }
}
