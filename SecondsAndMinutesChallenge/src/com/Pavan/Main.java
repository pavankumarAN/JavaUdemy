package com.Pavan;

public class Main {

    private static final String ERR_MSG = "Invalid value";
    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(64,45));
        System.out.println(getDurationString(3343L));
        System.out.println(getDurationString(-10,45));

    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes<0) || (seconds<0 || seconds>59)) {
            return ERR_MSG;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m "+ seconds + "s";
    }
    private static String getDurationString(long seconds) {
        if(seconds<0) {
            return ERR_MSG;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        //return minutes + "m " + remainingSeconds + "s";
        return getDurationString(minutes,remainingSeconds);
    }
}
