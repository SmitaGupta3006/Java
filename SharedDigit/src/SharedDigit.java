public class SharedDigit {

    public static boolean hasSharedDigit(int var1, int var2) {
        if ((var1 >= 10 && var1 <= 99) && (var2 >= 10 && var2 <= 99)) {
            int var1Last = var1 % 10;
            int var1First = var1 / 10;
            int var2Last = var2 % 10;
            int var2First = var2 / 10;

            if((var1First == var2First) || (var1First == var2Last) ||
                    (var1Last == var2First) || (var1Last == var2Last)){
                return true;
            }
            return false;
        }
        return false;
    }
}