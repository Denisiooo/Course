package Lesson11;

public class Time {
    public static void timeSixHour() {
        int hour = 0;
        OUTER:
        while (hour <= 6) {
            int min = -1;
            MIDDLE:
            do {
                min++;
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }
                int sec = 0;
                INNER:
                while (sec < 60) {
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
            } while (min < 59);
            hour++;
        }


//        OUTER:
//        for (int hour = 0; hour < 6; hour++) {
//            MIDDLE:
//            for (int min = 0; min < 60; min++) {
//                if (hour > 1 && min % 10 == 0) {
//                    break OUTER;
//                }
//                INNER2:
//                for (int sec = 0; sec < 60; sec++) {
//                    if (sec * hour > min) {
//                        continue MIDDLE;
//                    }
//                    System.out.println(hour + ":" + min + ":" + sec);
//                }
//            }
//        }
    }
}
