public class checkFan {
    public static void main(String[] args) {
        fan fan1 = new fan("Blue", 5);
        fan fan2 = new fan("Yellow", 10);
        fan1.turnOn();
        fan1.plusSpeed();
        fan1.plusSpeed();
        fan1.plusSpeed();
        fan1.turnOff();
        System.out.println(fan1.showStatus());
        fan2.turnOn();
        fan2.plusSpeed();
        System.out.println(fan2.showStatus());
    }
}
