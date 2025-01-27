package digitsinanumber;

public class AppMain {
    public static void main(String[] args) {

        Integer num = 345790845;

        int digits = 0;
        while(num > 0){
            digits += 1;
            num/=10;
        }
        System.out.println(digits);
    }
}
