package com.company;



import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int date, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE,date);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.YEAR,year);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
        System.out.println(dayOfWeek);
        return dayOfWeek;

    }

}

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day = sc.nextInt();

        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);

    }
}

