package Java2;

public class CheckLessonTime {
    public static void main(String[] args) {
        System.out.println("******" + checkTime(5) + "******");
    }

    private static String checkTime(int time) {
        String str;
        if (time >= 30) {
            str = "There is still a lot of time";
        } else if (time >= 15) {
            str = "There is not a lot of time left";
        } else if (time >= 7) {
            str = "There is very little time left for this lesson";
        } else {
            str = "Lesson's over!";
        }

        return str;
    }

}
