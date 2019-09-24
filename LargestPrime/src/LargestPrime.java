public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }else{
            for(int i = number/2 ; i >= 2; i--){
                if(number % i == 0){
                    int prime = i;
                    for(int j = 2; j <= Math.sqrt(prime); j++){
                        if(prime % j == 0){
                            break;
                        }else{
                            continue;
                        }
                    }
                    return prime;
                    }
                }
            }
        return -1;
    }
}
