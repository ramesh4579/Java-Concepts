package primenumber;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(isPrime(56));
        System.out.println(isPrime(13));
        System.out.println(isPrime(91));
        System.out.println(isPrime(23));
    }

    private static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
           if (num % i ==0){
               return false;
           }
        }
        return true;
    }
}
