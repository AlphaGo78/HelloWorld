package demo01;

/**
 * 判断质数
 */
public class PrimeDirective {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {
        int i = 2;
        if(n == 2){
            return true;
        }
        if (n < 2){
            return false;
        }
        while( i < n){
            if(n % i == 0){
                return false;
            }else{
                i++;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            if (isPrime2(i)) {
                System.out.println(i);
            }
        }
    }

}
