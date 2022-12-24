package designpatterns.builder;

public class Vehicle {

    // required parameters
    private String engine;

    private int wheel;

    // optional parameters
    private int airbags;

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.wheel = vehicleBuilder.wheel;
        this.airbags = vehicleBuilder.airbags;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    public static class VehicleBuilder {

        private String engine;
        private int wheel;
        private int airbags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags){
            this.airbags = airbags;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
