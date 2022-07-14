public class Plane implements Trans {
    int cost=1000;
    @Override
    public void choose(int budget) {
        if(cost<=budget){
            System.out.println("choose Driving");
        }
    }
}
