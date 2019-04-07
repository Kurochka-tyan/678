package lab6;
import lab8.*;
import org.junit.Test;
public class TestCostsException {
    @Test(expected = WrongCostsException.class)
    public void TestCostsException() throws WrongCostsException{
        ЛегковыеАвтомобили легковыеАвтомобили = new Седаны("Packard",10000,0,78);
    }
}
