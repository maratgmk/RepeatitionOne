package loop.fund;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Циклы
//  1 Напиши программу, которая моделирует работу благотворительного фонда. Фонду нужно собрать 1 млн.
//  долларов на спасение морских котиков. Каждый человек приносит произвольную сумму денег (1$, 5$, 10$, 100$) в фонд.
//  С каждой подаренной суммы правительство забирает от 5 до 10 % налога случайным образом. Когда фонд накопит необходимую сумму,
//  сообщите, что экспедиция по спасению началась.
public class Fund {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int total = 1_000_000;
        double current = 0;
        int[] coins = new int[]{1,5,10,100};
        while (current < total) {
            current = current + coins[random.nextInt(coins.length)] -
                    coins[random.nextInt(coins.length)]*random.nextDouble(0.05,0.1);
            System.out.println(current);
            Thread.sleep(1);
        }
        System.out.println("Экспедиция началась");
    }
}
