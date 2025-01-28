package factorialbyrecurssion;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(factorial(9));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }

    private static int  factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
