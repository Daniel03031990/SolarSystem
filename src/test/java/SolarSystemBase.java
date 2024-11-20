public class SolarSystemBase {
    public static void main(String[] args) {

        BasicSystem basicSystem = new BasicSystem();

        basicSystem.color = "Red";
        basicSystem.latitude = "23534254523";
        basicSystem.miles = "654646464";
        basicSystem.distance = "13636456";

        System.out.println(basicSystem.color + " " + basicSystem.distance);
        featureSun featureSun = new featureSun();

        featureSun.speed=1234;
        featureSun.time=4;
        featureSun.year="2025";

        planet1 planet1=new planet1();

        planet1.sun="Red and hot";
        planet1.gravity="unpredicatble";
        planet1.stars="billions";
        featureSun.speed = 1234;
        featureSun.time = 4;
        featureSun.year = "Saturn";

        planet2 planet2 = new planet2();
        planet2.availability = "always";
        planet2.year="Earth";
        planet2.quantity="516";


    }
}