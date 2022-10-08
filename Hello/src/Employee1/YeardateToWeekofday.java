package Employee1;

import java.util.Scanner;

public class YeardateToWeekofday {

	private static final String[] DAYS = {"SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        in.close();
        day += ((month < 3) ? year-- : (year - 2));
        int dayOfWeek = ((((23 * month) / 9) + day + 4 + (year / 4)) - (year / 100) + (year / 400)) % 7;
        System.out.println(DAYS[dayOfWeek]);
    }
}
