package lab6;
import java.util.Arrays;
import java.util.Scanner;

public class CarPark {
    private static int MaxCARS = 3;
    private ЛегковыеАвтомобили[] легковыеАвтомобилиs = new ЛегковыеАвтомобили[MaxCARS];
    private int counter;

    public void add(ЛегковыеАвтомобили легковыеАвтомобили) {
        легковыеАвтомобилиs[counter++] = легковыеАвтомобили;
    }

    @Override
    public String toString() {
        String result = "********ТАКСОПАРК********" + "\n";

        for (int i = 0; i < counter; i++) {
            result += i + 1 + ". " + легковыеАвтомобилиs[i].toString() + "\n";
        }
        return result + "*************************";
    }

    public int getPrice() {
        int result = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : легковыеАвтомобилиs) {
            if (легковыеАвтомобили != null) {
                result += легковыеАвтомобили.getPrice();

            }
        }
        return result;

    }
    public int getCosts() {
        int result = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : легковыеАвтомобилиs) {
            if (легковыеАвтомобили != null) {
                result += легковыеАвтомобили.getCosts();

            }
        }
        return 0;

    }
    public int getSpeed() {
        int result = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : легковыеАвтомобилиs) {
            if (легковыеАвтомобили != null) {
                result = легковыеАвтомобили.getSpeed();

            }
        }
        return 0;

    }

   public  ЛегковыеАвтомобили[] getЛегковыеАвтомобили(){
        return легковыеАвтомобилиs;


}


    public void sortByCost() {
        Arrays.sort(легковыеАвтомобилиs, new CostsComparator());
    }

    public void range() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальную скорость: ");
        int a = in.nextInt();
        System.out.print("Введите конечную скорость: ");
        int b = in.nextInt();

        for (int i = 0; i<легковыеАвтомобилиs.length;i++){
            if(легковыеАвтомобилиs[i].getSpeed()>=a && легковыеАвтомобилиs[i].getSpeed()<=b){
                System.out.println(легковыеАвтомобилиs[i]);
            }  }}}

