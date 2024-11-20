public class SolarSystemBase {
    public static void main(String[] args) {

        BasicSystem basicSystem=new BasicSystem();

        basicSystem.color="Red";
        basicSystem.latitude="23534254523";
        basicSystem.miles="654646464";
        basicSystem.distance="13636456";

        System.out.println(basicSystem.color + " " + basicSystem.distance);
        featureSun featureSun=new featureSun();

        featureSun.speed=1234;
        featureSun.time=4;
        featureSun.year=2025;
    }
}
