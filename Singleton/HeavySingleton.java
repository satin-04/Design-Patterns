public class HeavySingleton {
    private static HeavySingleton instance = new HeavySingleton();

    private HeavySingleton() {
        // constructor
    }

    public static HeavySingleton getInstance() {
        return instance;
    }
}