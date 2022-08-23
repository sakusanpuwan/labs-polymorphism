import interfaces.IPlayer;

public class ESportsPlayer implements IPlayer {

    private String name;
    private int age;
    private String game;

    public ESportsPlayer(String name, int age, String game){
        this.age = age;
        this.game = game;
        this.name = name;
    }

    public String setTactics(String tactics){
        return String.format("You're playing %s football", tactics);
    }

}
