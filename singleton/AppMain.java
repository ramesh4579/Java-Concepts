package singleton;

public class AppMain {
    public static void main(String[] args) {
        Singleton.INSTANCE.print();
        SingletonClass singletonClass = SingletonClass.getInstance();
    }
}
