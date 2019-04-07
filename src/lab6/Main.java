package lab6;
public class Main {
    public static void main(String[] args)  {
        CarPark carPark = new CarPark();

        carPark.add(new Фаэтоны("Packard", 10000, 45, 78));
        carPark.add(new Седаны("Mercury Monterey", 48154, 452,25));
        carPark.add(new Универсалы("Buick Roadmaster Limited", 47843, 152,50));
        System.out.println(carPark);
        System.out.println("Цена автопарка: " + carPark.getPrice() + " $");
        System.out.println("***Сортировка по расхожу топлива по возрастанию***");
        carPark.sortByCost();
        System.out.println(carPark);
        System.out.println("***Диапазон***");
        carPark.range();
        System.out.println(carPark.getSpeed());



    }

}