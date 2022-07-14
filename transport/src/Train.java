public class Train implements Trans {
    int cost=400;
    @Override
    public void choose(int budget) {
        if(cost<=budget){
            System.out.println("chooseTrain");
        }
    }
}
