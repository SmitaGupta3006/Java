public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) ||
                year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        boolean leapYearStatus = isLeapYear(year);
        int days;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if(leapYearStatus){
                    days = 29;
                }else {
                    days = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                return -1;
        }
        return days;
    }
}

