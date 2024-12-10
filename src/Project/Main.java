package Project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. ");
            int choice = scanner.nextInt();
            switch (choice) {
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
private static void addTrafficLight(Scanner scanner){
        System.out.print("Enter the location :");
        String location=scanner.nextLine();
    System.out.print("Enter the green duration (in seconds): ");
    int greenDuration=scanner.nextInt();
    System.out.print("Enter the yellow duration (in seconds): ");
    int yellowDuration=scanner.nextInt();
        System.out.print("Enter the red duration (in seconds): ");
    int redDuration=scanner.nextInt();
        id++;
if(greenDuration<60||(yellowDuration<10&&yellowDuration>30)||redDuration<60||greenDuration+yellowDuration+redDuration>150){
    System.out.println("Invalid durations .");
    return;
}
TrafficLight trafficLight=new TrafficLight(id,location,greenDuration,yellowDuration,redDuration,"Red");
trafficLight.add(trafficLight);
saveTrafficLightsToFile();
}
private static void updateTrafficLight(Scanner scanner) {
    System.out.print("Enter the id of the traffic light to update :");
    int id = scanner.nextInt();
    TrafficLight trafficLight = findTrafficLightById(id);
    if (trafficLight == null) {
        System.out.println("Traffic light not found.");
        return;
    }
    System.out.print("Enter the new location :");
    String newLocation = scanner.nextLine();
    trafficLight.setLocation(newLocation);
    System.out.print("Enter the new green duration  :");
    int newGreenDuration = scanner.nextInt();
    trafficLight.setGreenDuration(newGreenDuration);
    System.out.print("Enter the new yellow duration  :");
    int newYellowDuration = scanner.nextInt();
    trafficLight.setYellowDuration(newYellowDuration);
    System.out.print("Enter the new red duration  :");
    int newRedDuration = scanner.nextInt();
    trafficLight.setRedDuration(newRedDuration);
    saveTrafficLightsToFile();
}
private static TrafficLight findTrafficLightById(int id){
        for(Traffic trafficLight:trafficLights){
            if(trafficLight.getId()==id){
                return trafficLight;
            }
        }
        return null;
}
private static void deleteTrafficLight(Scanner scanner){
        System.out.print("Enter the id of the traffic light to delete:");
        int id=scanner.nextInt();
        trafficLights.removeIf(t->t.getId()==id);
    saveTrafficLightsToFile();
}
private static void listtTrafficLights() {
    for (TrafficLight trafficLight : trafficLights) {
        System.out.println("ID: " + trafficLight.getId());
        System.out.println("Location: " + trafficLight.getLocation());
        System.out.println("Green Duration: " + trafficLight.getGreenDuration());
        System.out.println("Yellow Duration: " + trafficLight.YellowDuration());
        System.out.println("Red Duration: " + trafficLight.getRedDuration());
        System.out.println("Current state: " + trafficLight.getCurrentState());
    }
}

}