class TrafficLight {
    String color;
    int duration; 
    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }
    boolean isRed() {
        return color.equalsIgnoreCase("red");
    }
    boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }
    void displayLight() {
        System.out.println("Current Color: " + color + ", Duration: " + duration + " seconds.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayLight();
        if (light.isRed()) {
            System.out.println("Stop! The light is RED.");
        }
        light.changeColor("Green", 40);

        if (light.isGreen()) {
            System.out.println("Go! The light is GREEN.");
        }
    }
}
