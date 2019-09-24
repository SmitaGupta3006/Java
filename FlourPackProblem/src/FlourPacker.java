public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else if(goal == (5 * bigCount + smallCount)){
            return true;
        }else if(goal < (5 * bigCount + smallCount)){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 1; i <= bigCount; i++){
                sum1 = 5 * i;
                if(sum1 <= goal){
                    continue;
                }else{
                    sum1 = 5 * (i-1);
//                    System.out.println("sum1" + sum1);
                    break;
                }
            }
            if(sum1 == goal) {
                return true;
            }else{
                for (int j = 1; j <= smallCount; j++) {
                    sum2 = sum1 + j;
                    if (sum2 <= goal) {
                        continue;
                    } else {
                        sum2 = (sum1 + (j-1));
//                        System.out.println("sum2" + sum2);
                        break;
                    }
                }
                if(sum2 == goal){
                    return true;
                }
            }
        }
        return false;
    }
}
