package designpatterns.factory;

public abstract class Vehicle {

    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel: " + this.getWheel();
    }
}
