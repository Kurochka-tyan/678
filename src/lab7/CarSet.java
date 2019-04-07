package lab7;
import lab6.*;
import lab8.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class CarSet implements Set<ЛегковыеАвтомобили> {
    private static final int MaxCARS = 15;
    private ЛегковыеАвтомобили[] elements = new ЛегковыеАвтомобили[MaxCARS];
    private int size = 0;

    public CarSet() {
    }

    public CarSet(ЛегковыеАвтомобили легковыеАвтомобили) {
        add(легковыеАвтомобили);
    }

    public CarSet(Collection<ЛегковыеАвтомобили> collection) {
        addAll(collection);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<ЛегковыеАвтомобили> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<ЛегковыеАвтомобили> iterator() {
        return new Iterator<ЛегковыеАвтомобили>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public ЛегковыеАвтомобили next() {
                return elements[index++];
            }
        };
    }

    @Override
    public  Object[] toArray() {
        Iterator<ЛегковыеАвтомобили> легковыеАвтомобилиIterator = iterator();
        Object[] o = new Object[MaxCARS];
        int i = 0;
        while (легковыеАвтомобилиIterator.hasNext()){
            o[i++] = легковыеАвтомобилиIterator.next();
        }
        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(ЛегковыеАвтомобили addedЛегковыеАвтомобили) {
        if (addedЛегковыеАвтомобили.getCosts()<=1000){
            throw new WrongCostsException();
        }
        if (addedЛегковыеАвтомобили.getPrice()<1500) {
            throw new WrongPriceException();
        }
        if (addedЛегковыеАвтомобили.getSpeed()<=0) {
            throw new WrongSpeedException();
        }


        elements[size++] = addedЛегковыеАвтомобили;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<ЛегковыеАвтомобили>легковыеАвтомобилиIterator = iterator();
        Iterator<?> cIterator = c.iterator();
        while (cIterator.hasNext()){
            while (легковыеАвтомобилиIterator.hasNext()){
                if(cIterator.next() == легковыеАвтомобилиIterator.next()){
                    break;
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends ЛегковыеАвтомобили> c) {
        boolean ft = false;
        try {
            for (ЛегковыеАвтомобили addingЛегковыеАвтомобили : c) {
                if (add(addingЛегковыеАвтомобили)) {
                    ft = true;
                }
                add(addingЛегковыеАвтомобили);
            }
        }catch (IndexOutOfBoundsException e){
            return false;
        }
        return ft;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }
}
