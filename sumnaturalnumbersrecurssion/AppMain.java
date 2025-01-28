package sumnaturalnumbersrecurssion;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(465));
        System.out.println(sum(7));
        System.out.println(sum(9));
        System.out.println(sum(8));
    }

    private static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num -1);
    }
}
