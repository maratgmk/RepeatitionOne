package method_switch.call;

import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    public static TimeOfDay getTeacherTime(){
        return TimeOfDay.values()[ThreadLocalRandom.current().nextInt(TimeOfDay.values().length)];
    }
}
