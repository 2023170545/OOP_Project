package Project;

public class Vehicle {
    private String id;
    private VehicleType type;
    private String LicensePlate;
    private String owner;
                                                   // Enum to define the type of vehicle
    public enum VehicleType {
        CAR, TRUCK, BIKE
    }

    public Vehicle(String id, Project.Vehicle.VehicleType type, String licensePlate, String owner) {
        this.id = id;
        this.type = type;
        LicensePlate = licensePlate;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Project.Vehicle.VehicleType getType() {
        return type;
    }

    public void setType(Project.Vehicle.VehicleType type) {
        this.type = type;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString(){
        return "Vehicle ID: "+id+"\n"+"Type: "+type+"\n"+"license Plate: "+LicensePlate+"\n"+"Owner: "+owner;
    }

}
