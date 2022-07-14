public class Bus implements Trans {
    int cost=300;
    @Override
    public void choose(int budget) {
        if(cost<=budget){
            System.out.println("choose Bus");
        }
    }
}
