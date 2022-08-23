package footballPlayer;

public class Midfielder extends FootballPlayer {

    private String name;
    private int price;
    private int age;

    private int totalAssists = 0;
    private int totalPasses = 0;

    public Midfielder(String name, int price, int age){
        super(name,price,age);
        this.totalAssists = 0;
        this.totalPasses = 0;


    }

    public String introduce(){
        return "I'm a midfielder";
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(int totalAssists) {
        this.totalAssists = totalAssists;
    }

    public int getTotalPasses() {
        return totalPasses;
    }

    public void setTotalPasses(int totalPasses) {
        this.totalPasses = totalPasses;
    }
}
