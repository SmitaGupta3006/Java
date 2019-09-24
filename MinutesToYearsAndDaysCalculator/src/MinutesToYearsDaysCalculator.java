public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / (60L * 24L);
            long years = days / 365L;
            long netdays = days % 365L;
            System.out.println(minutes + " min = " + years + " y and " + netdays + " d");
        }
    }
}
