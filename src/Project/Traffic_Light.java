package Project;

public class Traffic_Light {
    private int id=0;
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
        if(greenDuration>=60){
            this.greenDuration=greenDUration;
        }
        else
            throw new IllegalArgumentException("Duration must be 1 minute or more");
    }

    public int getYellowDuration() {
        return yellowDuration;
    }

    public void setYellowDuration(int yellowDuration) {
        if(yellowDuration>=10&&yellowDuration<=30){
            this.yellowDuration=yellowDuration;
        }
        else
            throw new IllegalArgumentException("Duration must be between 10 and 30 seconds");
    }

    public int getRedDuration() {
        return redDuration;
    }

    public void setRedDuration(int redDuration) {
        if(redDuration>=60){
            this.redDuration=redDuration;
        }
        else
            throw new IllegalArgumentException("Duration must be 1 minute or more");

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
