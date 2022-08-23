package footballPlayer;

public class Striker extends FootballPlayer{

    private int totalGoals;
    private int totalShots;

    private String name;
    private int price;
    private int age;

    public Striker(String name, int price, int age){
        super(name, price, age);
        this.totalGoals = 0;
        this.totalShots = 0;
    }

    public void takeShot(){
        this.totalShots += 1;
    }

    public void scoreGoal(){
        this.totalGoals += 1;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getTotalShots() {
        return totalShots;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public void setTotalShots(int totalShots) {
        this.totalShots = totalShots;
    }

    public String celebrateGoal(){
        return "kneeslide";
    }

    public String celebrateGoal(String celebration){
        return celebration;
    }

    public String introduce(){
        return "I'm a striker";
    }


}
