package method_switch.call;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * switch
 * 2 Программа «Созвон с преподавателем». Создайте перечисление времени суток (утро, день, вечер, ночь).
 * Пользователь вводит, когда он готов созвониться с преподавателем, чтобы задать вопросы по домашнему заданию.
 * Компьютер случайным образом выбирает, в какое время свободен преподаватель.
 * Если время суток совпало, то программа должна вывести «Созвон состоялся».
 * Если не совпало, то программа выводит «не сегодня».
 */
public class ConferenceCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose time of day for conference call");
        System.out.println(Arrays.toString(TimeOfDay.values()));
        String userTime = scanner.nextLine();
        TimeOfDay timeOfUser = TimeOfDay.valueOf(userTime.toUpperCase(Locale.ROOT));
        System.out.println(timeOfUser);
        TimeOfDay timeOfTeacher = Teacher.getTeacherTime();
        System.out.println(timeOfTeacher);
        String result;
        if (timeOfUser == timeOfTeacher){
            result = "Созвон состоялся";
        } else {
        result = "Не сегодня";}

        //  String result1 = timeOfUser.equals(timeOfTeacher) ? "Созвон состоялся" : "Не сегодня";
        System.out.println(result);

        //Operator Switch не подходит

    }
}

