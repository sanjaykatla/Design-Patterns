package designpatterns.singleton;

public class SingletonSynchronized {

    private SingletonSynchronized() {

    }

    private static SingletonSynchronized instance = null;

    public synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
