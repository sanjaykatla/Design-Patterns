package designpatterns.factory;

public class VehicleFactory {

    public static Vehicle getInstance(String type, int wheel){
        if(type.equals("car")) return new Car(wheel);
        if(type.equals("bike")) return new Bike(wheel);
        return null;
    }
}
