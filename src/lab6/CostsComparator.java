package lab6;
import java.util.Comparator;

public class CostsComparator implements Comparator<ЛегковыеАвтомобили> {

    @Override
    public int compare(ЛегковыеАвтомобили a, ЛегковыеАвтомобили b) {
        Integer cost1 = (a.getCosts());
        Integer cost2 = (b.getCosts());
        return cost1.compareTo(cost2);
    }
}
