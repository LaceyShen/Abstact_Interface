public class Driving implements Trans {
    int cost=500;
    @Override
    public void choose(int budget) {
        if(cost<=budget){
            System.out.println("choose Driving");
        }
    }
}
