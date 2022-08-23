package footballPlayer;

public class Defender extends FootballPlayer {
    private String name;
    private int price;
    private int age;

    private int totalTackles;
    private int totalCleanSheets;

    public Defender(String name, int price, int age){
        super(name, price, age);
        this.totalTackles = 0;
        this.totalCleanSheets = 0;
    }

    public int getTotalCleanSheets() {
        return totalCleanSheets;
    }

    public int getTotalTackles() {
        return totalTackles;
    }

    public void setTotalCleanSheets(int totalCleanSheets) {
        this.totalCleanSheets = totalCleanSheets;
    }

    public void setTotalTackles(int totalTackles) {
        this.totalTackles = totalTackles;
    }

    public void tackle(){
        this.totalTackles += 1;
    }

    public void keepCleanSheet(){
        this.totalCleanSheets += 1;
    }

    public String introduce(){
        return "I'm a defender";
    }
}
