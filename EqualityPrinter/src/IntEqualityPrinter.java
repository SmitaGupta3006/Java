public class IntEqualityPrinter {
    public static void  printEqual(int var1, int var2, int var3){
        if(var1 < 0 || var2 < 0 || var3 < 0){
            System.out.println("Invalid Value");
        }else if(var1 == var2 && var2 == var3) {
            System.out.println("All numbers are equal");
        }else if((var1 != var2) && (var2 != var3) && (var3 != var1)) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
        }
    }

