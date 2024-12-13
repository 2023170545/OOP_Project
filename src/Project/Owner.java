package Project;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author mahmo
 */
import java.util.ArrayList;
import java.util.List;

public class Owner extends Person{
    private ArrayList<Vehicle>vehicles=new ArrayList<>();


    public Owner(String id, String name, String contactInfo) {
        super(id,name,contactInfo);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
  

