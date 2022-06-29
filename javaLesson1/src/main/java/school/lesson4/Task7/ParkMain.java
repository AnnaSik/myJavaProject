package school.lesson4.Task7;

public class ParkMain {
    public static void main(String[] args) {
        Park attraction;
        attraction = new Park ("Горького");
        attraction.getAttraction("Колесо обозрения");
        attraction.obtainAttraction("Колесо обозрения", "08:00", "20:00", 10);
        System.out.println(attraction);
    }
}
