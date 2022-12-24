package designpatterns.singleton;

public class SingletonThreadSafe {

    private SingletonThreadSafe() {

    }

    private static SingletonThreadSafe instance = null;

    public static synchronized SingletonThreadSafe getInstance(){
        if(instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
