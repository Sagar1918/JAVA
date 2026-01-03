package OOPS2;

public interface VehicleInterface {
    boolean isVehicle();

    String getCompany();
}

/**
 * 1. Interfaces are pure abstract classes, they have the "public abstract" as
 * default & no need to mention with methods.
 * 2. We are unable to create a new vehicleInterface but we can give as a
 * reference.
 * 3. If we declare any variable in an interface, it is "public static final" by
 * default.
 * Ex: int num = 10; ------> It is treated as-----> public static final int num
 * = 10;
 */