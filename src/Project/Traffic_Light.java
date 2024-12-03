package Project;

public class Traffic_Light {
    private int id;
    private String location;
    private String status;
    private int duration;

    public Traffic_Light(int id, String location, String status, int duration) {
        this.id = id;
        this.location = location;
        this.status = status;
        this.duration = duration;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equalsIgnoreCase("Red")||
                status.equalsIgnoreCase("Green")
        ||status.equalsIgnoreCase("Yellow")){
            this.status = status;

        }
        else
            throw new IllegalArgumentException("Invalid Status.It should be green or yellow or red");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration>0)
            this.duration = duration;
        else
            throw new IllegalArgumentException("Duration must be greater than 0");

    }
    public void nextcycle(){
        switch (status.toLowerCase()){
            case "red":
                status="green";
                break;
            case "green":
                status="yellow";
                break;
            case "yellow":
                status="red";
                break;
        }
    }
    @Override
    public String toString(){
        return "Traffic Light[id="+id+
                ",Location is"+location+
                ",status is"+status+
                ",Duration="+duration+"seconds";
    }
}
