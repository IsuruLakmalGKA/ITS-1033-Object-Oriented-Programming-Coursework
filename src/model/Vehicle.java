package model;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

abstract public class Vehicle {
         String vehicleNumber;
         String vehicleType;
         int maximumWeight;
         int numOfPassengers;

         abstract public void park(String vehicleNumber, String vehicleType);

         abstract public void leavePark(String vehicleNumber, String vehicleType);

         abstract public String setSlot(String vehicleNumber, String vehicleType);

}
