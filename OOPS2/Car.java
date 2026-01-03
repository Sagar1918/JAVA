package OOPS2;

public class Car extends Vehicle implements VehicleInterface, CarInterface {

    @Override
    public boolean isVehicle() {
        return true;
    }

    @Override
    public String getCompany() {
        return " ";
    }

    public int numOfGears() {
        return 0;
    }

}
