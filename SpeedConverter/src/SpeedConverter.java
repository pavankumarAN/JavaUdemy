public class SpeedConverter {
    public static long toMilesPerHour(double kiloMeter) {
        if(kiloMeter<0) {
            return -1;
        }

        return Math.round(kiloMeter/1.609);
    }
    public static void printConversion(double kiloMeter) {
        if(kiloMeter<0) {
            System.out.println("Invalid entry");
        }
        else {
            long milesPerHour = toMilesPerHour(kiloMeter);
            System.out.println(kiloMeter + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
