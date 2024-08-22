package method_switch.snack;


public class Automat {
   Snack[] snacks;

    public Automat(Snack[] snacks) {
        this.snacks = snacks;

    }
    public Snack getSnack(int number){
        return snacks[number - 1];
    }
}

