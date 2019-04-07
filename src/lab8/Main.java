package lab8;
import lab6.*;
import lab7.*;

public class Main {
    public static void main(String[] args) throws WrongCostsException {
        try{
            new CarSet().add(new Седаны("Packard",10000,0,78));
        }
        catch (WrongPriceException e){
            System.out.println(e.getMessage());
        }
        catch (WrongCostsException e){
            System.out.println(e.getMessage());
        }
    }
}
