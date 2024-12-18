public class Hangar {

    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", 25);
        System.out.println(mercedes.doStuff());

        Boat zodiac = new Boat("Zodiac", 50);
        System.out.println(zodiac.doStuff());
    }
}
