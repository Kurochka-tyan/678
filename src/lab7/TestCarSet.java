package lab7;

import lab6.*;
import lab8.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCarSet extends Assert {
    CarSet carSet;
    @Before
    public void before(){
        carSet = new CarSet();
    }
    @Test
    public void testMySet() {
        assertEquals(0, carSet.size());
    }

    @Test(expected = WrongCostsException.class)
    public void testWrongCostsException()throws WrongCostsException{
        carSet.add(new Седаны("Packard",10000,10,78));
    }
    @Test(expected =WrongPriceException.class)
    public void testWrongPriceException() throws WrongPriceException{
        carSet.add(new Фаэтоны("Packardпев",10,8000,758));}
    @Test
    public void testAdd()
    {
        carSet.add(new Универсалы("Packaghgrd",1004400,4500,768));
        assertEquals(1, carSet.size());
    }

    @Test
    public void testContains() {
        ЛегковыеАвтомобили легковыеАвтомобили;
        легковыеАвтомобили = new Седаны("Packard",10000,4545,78);
        carSet.add(легковыеАвтомобили);
        легковыеАвтомобили = new Фаэтоны("Packardпев",1004500,8000,758);
        carSet.add(легковыеАвтомобили);
        assertTrue(carSet.contains(легковыеАвтомобили));
    }
}