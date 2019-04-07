package lab7;
import lab6.ЛегковыеАвтомобили;
import lab6.Седаны;
import lab6.Универсалы;
import lab6.Фаэтоны;

import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        CarSet carSet = new CarSet();
        carSet.add(new Универсалы ("Mercury Monterey",48154,452,-600));
        carSet.add(new Седаны("Packard",10000,45,78));
        carSet.add(new Фаэтоны("Buick Roadmaster Limited",47843,152,50));

        Iterator<ЛегковыеАвтомобили> iterator = carSet.iterator();
        System.out.println(carSet.isEmpty());
        System.out.println(carSet.size());
        System.out.println(carSet.contains(new Универсалы ("Mercury Monterey",48154,452,25)));
        carSet.remove(new Седаны("Packard",10000,45,78));
        System.out.println(carSet.remove((new Фаэтоны("Buick Roadmaster Limited",47843,152,50))));

        int x = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : carSet) {
            System.out.println(iterator.next());
            x++;
        }

        System.out.println(x);
        System.out.println(carSet.containsAll(carSet));
    }
}
