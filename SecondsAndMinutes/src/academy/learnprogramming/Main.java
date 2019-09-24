package academy.learnprogramming;

public class Main {
    // Constant Declaration
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }
    private static String getDurationString(long minutes, long seconds){
      if( minutes >= 0 && (seconds >= 0 && seconds <= 59)){
         long hour = minutes / 60;
         long netMinutes = minutes % 60;

         String hourString = hour + "h";
         if(hour < 10){
             hourString = "0" + hourString;
         }
          String minutesString = netMinutes + "m";
          if(netMinutes < 10){
              minutesString = "0" + minutesString;
          }
          String secondsString = seconds + "h";
          if(seconds < 10){
              secondsString = "0" + secondsString;
          }

         return (hourString + " " + minutesString + " " + secondsString);
      }
      return INVALID_VALUE_MESSAGE;
    }
    private static String getDurationString(long seconds){
        if(seconds >= 0){
           long minutes = seconds / 60;
           seconds = seconds % 60;
           return getDurationString(minutes, seconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
