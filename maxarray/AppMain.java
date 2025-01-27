package maxarray;

public class AppMain {
    public static void main(String[] args) {
        int [] arr = {-7 , 9 , 2 , -6, 373, 76545, -8765, 8};

        int max = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
