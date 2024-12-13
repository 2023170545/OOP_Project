package Project;

public class Traffic_Light {
    private  static int id=0;
    private String location;
    private int greenDuration;
    private int yellowDuration;
    private int redDuration;
    private String currentState;

    public Traffic_Light(int id, String location, int greenDuration, int yellowDuration, int redDuration, String currentState) {
        this.id = id;
        this.location = location;
        this.greenDuration = greenDuration;
        this.yellowDuration = yellowDuration;
        this.redDuration = redDuration;
        this.currentState = currentState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGreenDuration() {
        return greenDuration;
    }

    public void setGreenDuration(int greenDuration) {
        this.greenDuration = greenDuration;
    }

    public int getYellowDuration() {
        return yellowDuration;
    }

    public void setYellowDuration(int yellowDuration) {
        this.yellowDuration = yellowDuration;
    }

    public int getRedDuration() {
        return redDuration;
    }

    public void setRedDuration(int redDuration) {
        this.redDuration = redDuration;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Traffic_Light{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", greenDuration=" + greenDuration +
                ", yellowDuration=" + yellowDuration +
                ", redDuration=" + redDuration +
                ", currentState='" + currentState + '\'' +
                '}';
    }
}
