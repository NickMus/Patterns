package Singleton;

public class Earth {
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance(){
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
