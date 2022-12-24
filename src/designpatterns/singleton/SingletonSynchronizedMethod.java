package designpatterns.singleton;

public class SingletonSynchronizedMethod {

    private SingletonSynchronizedMethod() {

    }

    private static SingletonSynchronizedMethod instance = null;

    public static synchronized SingletonSynchronizedMethod getInstance(){
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}
