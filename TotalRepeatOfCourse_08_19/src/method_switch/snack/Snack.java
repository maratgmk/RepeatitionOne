package method_switch.snack;

public enum Snack {
    HAMBURGER(1,"Meat",12.56),
    HOT_DOG(2,"Sausage",7.49),
    BAGEL(3,"Fish",14.35),
    SNICKERS(4,"Sweet",3.15),
    BOUNTY(5,"Sweet",3.25),
    PEPSI(6,"Beverage",1.57),
    COFFEE(7,"Hot Drink",2.73);

    private final String type;
    private final double price;
    private final int id;

    Snack( int id, String type, double price) {
        this.type = type;
        this.price = price;
        this.id = id;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
