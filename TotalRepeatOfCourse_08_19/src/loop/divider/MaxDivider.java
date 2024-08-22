package loop.divider;

import java.util.Arrays;
import java.util.Scanner;

/*
2 Необходимо найти максимальный делитель числа, введённого пользователем.
 Программу повторять, пока пользователь не введёт «stop».
 */
public class MaxDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        do{
            System.out.println("Enter any integer");
            int number = scanner.nextInt();scanner.nextLine();// Nota Bene!!!
            int max = -100;
            for (int i = number - 1; i > 0; i--) {
                if (number % i == 0) {
                    max = i;
                   // System.out.println(max);
                    break;
                }
            }
            System.out.println("max =  " + max);
            System.out.println("Enter any word");
            word = scanner.nextLine();
        }
        while (!word.equalsIgnoreCase("sTOp"));
    }
}

