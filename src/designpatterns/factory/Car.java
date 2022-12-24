package designpatterns.factory;

public class Car extends Vehicle{

    private int wheel;
    public Car(int wheel){
        this.wheel = wheel;
    }
    @Override
    public int getWheel() {
        return this.wheel;
    }
}
