package Project;
import java.util.List;
import java.util.ArrayList;
public class TrafficViolation {
    private int violationId;
    private String vehicleId;
    private String violationType;
    private String date;
    private double fineAmount;
    private Zone zone;

    //constructor


    public TrafficViolation(int violationId, String vehicleId, String violationType, String date, double fineAmount, Zone zone) {
        this.violationId = violationId;
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.date = date;
        this.fineAmount = fineAmount;
        this.zone = zone;

    }

    public TrafficViolation(String vehicleId, String violationType, String date, Zone zone) {
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.date = date;
        this.zone = zone;
    }

    //getter and setter
    public int getViolationId() {
        return violationId;
    }

    public void setViolationId(int violationId) {
        this.violationId = violationId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    //display information vehicle
    public void displayViolationInfo() {
        System.out.println("Violation ID: " + violationId);
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Violation Type: " + violationType);
        System.out.println("Date: " + date);
        System.out.println("Fine Amount: $" + fineAmount);
        System.out.println("Violation Zone :" + zone);

    }

    // check function

    public String CheckVehicleStatus(Vehicle v, boolean status) {
        if (v.getId() != null) {
            if (v.getId().equals(getVehicleId())) {
                System.out.println("vehicle found");
                if (status) {
                    System.out.println("Of course there is a violation");
                    System.out.println("Violation Type: " + violationType);
                } else {
                    System.out.println("Certainly there is no violation");
                    System.out.println("Vehicle ID: " + v.getId());
                }
            } else {
                System.out.println("vehicle not found");
                return v.getId();
            }
        }
        return "THANK YOU";
    }
private static List<TrafficViolation> violations=new ArrayList<>();
    public static void displayViolationByAdmin() {
        System.out.print("Enter ID or Zone");
        Scanner scanner = new Scanner(System.in);
        String vehicleIdOrZone = scanner.nextLine();
        List<TrafficViolation> results = getViolationsByVehicleOrZone(vehicleIdOrZone);
        if (results.isEmpty()) {
            System.out.println("No violations found for the given ID or Zone.");
        } else {
            for (TrafficViolation violation : results) {
                System.out.println("Vehicle ID:" + violation.getViolationId());
                System.out.println("Zone:" + violation.getZone());
                System.out.println("Vehicle Type:" + violation.getViolationType());
                System.out.println("Fine Amount:" + violation.getFineAmount());
                System.out.println("------------------------------");
            }
        }
    }
        public static List<TrafficViolation> getViolationsByVehicleOrZone (String vehicleIdOrZone) {
            List<TrafficViolation> matchingViolations = new ArrayList<>();
            for (TrafficViolation violation : violations) {
                if (violation.getVehicleId().equals(vehicleIdOrZone) || violation.getZone().equals(vehicleIdOrZone)) {
                    matchingViolations.add(violation);
                }
            }
            return matchingViolations;
        }

    }


