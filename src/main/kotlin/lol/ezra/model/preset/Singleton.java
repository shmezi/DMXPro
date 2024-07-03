package lol.ezra.model.preset;

public final class Singleton { //No possibility for extending a singleton


    private static Singleton instance;


    //Private constructor to ensure the only place an instance can be created is internally.
    private Singleton() {
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
