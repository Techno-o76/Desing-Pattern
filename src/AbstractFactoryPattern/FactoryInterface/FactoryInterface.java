package AbstractFactoryPattern.FactoryInterface;


// return the object of the vehicle as per the business requirement

import AbstractFactoryPattern.Objects.Vehicle;

// used to select which subfactories we want to take action for making our product.
public interface FactoryInterface {
    public Vehicle getVehicle(String vehicle);

}
