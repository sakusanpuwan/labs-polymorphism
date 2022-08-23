import footballPlayer.FootballPlayer;

import java.util.ArrayList;

public class Club {

    private String name;
    private String owner;
    private String manager;
    private int trophyCount;

    private ArrayList<FootballPlayer> footballPlayers;

    public Club(String name, String owner, String manager,int trophyCount){
        this.name = name;
        this.owner = owner;
        this.manager = manager;
        this.trophyCount = trophyCount;
        this.footballPlayers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }

    public int getTrophyCount() {
        return trophyCount;
    }

    public void setFootballPlayers(ArrayList<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    public String getManager() {
        return manager;
    }

    public String getOwner() {
        return owner;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void addFootballPlayer(FootballPlayer footballPlayer){
        this.footballPlayers.add(footballPlayer);
    }

    public int countFootballPlayers(){
        return this.footballPlayers.size();
    }

    public String teamIntroduce(){
        if (footballPlayers.size() != 0){
            for (int i = 0; i < footballPlayers.size(); i++) {
                return footballPlayers.get(i).introduce();
            }
        } else {
            return "You've got no players";
        }
        return null;
    }



}
