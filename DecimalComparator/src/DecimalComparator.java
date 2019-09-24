public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(
            double firstNumber, double secondNumber){
        if((firstNumber >= 0 && secondNumber >= 0) ||
                (firstNumber < 0 && secondNumber < 0)){
            int variable1 = (int)(firstNumber * 1000);
            int variable2 = (int)(secondNumber * 1000);
            if (variable1 == variable2){
                return true;
            }
            return false;
        }
        return false;
    }
}
