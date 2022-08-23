package footballPlayer;

import interfaces.IPlayer;

public abstract class FootballPlayer implements IPlayer {

    private String name;
    private int price;
    private int age;

    private int morale;

    public FootballPlayer(String name, int price, int age){
        this.name = name;
        this.price = price;
        this.age = age;
        this.morale = 5;
    }

    public void motivatePlayer(){
        this.morale += 2;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String introduce();

    public String setTactics(String tactics){
        return String.format("You're playing %s football", tactics);
    }

}
