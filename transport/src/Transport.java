public class Transport {
    public static void main(String[] args) {
        int budget=500;
        Driving driving=new Driving();
        driving.choose(budget);
        Bus bus=new Bus();
        bus.choose(budget);
        Train train=new Train();
        train.choose(budget);
        Plane plane=new Plane();
        plane.choose(budget);
    }
}
