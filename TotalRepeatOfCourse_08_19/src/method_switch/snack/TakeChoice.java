package method_switch.snack;

import java.util.Arrays;
import java.util.Scanner;
/**
 * switch
 * 1 Создайте перечисление с наименованием снеков в снек-автомате.
 * Пользователь вводит номер снека. Автомат сообщает, какой снек был выдан.
 */

public class TakeChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете перекус по номеру id");
        System.out.println(Arrays.toString(Snack.values()));
        int id = scanner.nextInt();

        Automat automat = new Automat(Snack.values());
        System.out.println(automat.getSnack(id).name());
        System.out.println(automat.getSnack(id));
    }
}
