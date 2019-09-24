public class LastDigitChecker {

    public static boolean hasSameLastDigit(int var1, int var2, int var3){
        if(isValid(var1) && isValid(var2) && isValid(var3)){
            int lastDigit1 = var1 % 10;
            int lastDigit2 = var2 % 10;
            int lastDigit3 = var3 % 10;
            if((lastDigit1 == lastDigit2) ||
                    (lastDigit2 == lastDigit3)||
                    (lastDigit3 == lastDigit1 )){
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }
}
