package lab6;
public class ЛегковыеАвтомобили {


    private String name;
    private int price;
    private int costs;
    private int speed;

    public ЛегковыеАвтомобили(String name, int price, int costs, int speed) {

        this.name = name;
        this.price = price;
        this.costs = costs;
        this.speed = speed;

    }


    public int getPrice() {

        return price;
    }

    public int getCosts() {

        return costs;
    }

    public int getSpeed(){

        return speed;
    }

    @Override
    public String toString() {

        return name + " (" + this.getClass().getSimpleName() + "): " + price + " $;" + "\n" + "***Расходы топлива в месяц:" + costs + " л."+ speed + "км в час."+ "\n";
    }
}