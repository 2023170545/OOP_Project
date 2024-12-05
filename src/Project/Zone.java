package Project;

import java.util.Arrays;

public class Zone {//there is problem because trafficofficer class inherits from zone

    private int id;
    private String name;
    private String location;
    private Traffic_Light[]t;


    public Zone(int id, String name, String location, Traffic_Light[] t) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.t = t;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Traffic_Light[] getT() {
        return t;
    }

    public void setT(Traffic_Light[] t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", trafficLights=" + Arrays.toString(t) +
                '}';
    }
}
