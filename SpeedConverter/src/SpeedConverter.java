public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            return -1;
        } else {
            long milesPerhour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerhour + " mi/h");
            return milesPerhour;
        }
    }
    public static void printConversion(double kilometersperhour) {
        toMilesPerHour(kilometersperhour);
    }
}




