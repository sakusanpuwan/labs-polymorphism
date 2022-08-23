import footballPlayer.Defender;
import footballPlayer.Midfielder;
import footballPlayer.Striker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClubTest {

    private Club club;

    @BeforeEach
    public void setUp(){
        this.club = new Club("Chelsea","Todd Boehly","Thomas Tuchel",25);

    }

    @Test
    public void canAddFootballPlayers(){
        Defender defender = new Defender("Thiago Silva",20,37);
        club.addFootballPlayer(defender);
        Striker striker = new Striker("Kai Havertz",70,23);
        club.addFootballPlayer(striker);
        int expected = 2;
        int actual = club.countFootballPlayers();
        assertEquals(expected,actual);

    }

    @Test
    public void canIntroduceTeam(){
        Midfielder midfielder = new Midfielder("Mason Mount",25,120);
        club.addFootballPlayer(midfielder);
        String expected = "I'm a midfielder";
        String actual = this.club.teamIntroduce();
        assertEquals(expected,actual);

    }

    @Test
    public void canIntroduceTeamWithMultiplePlayers(){
        Midfielder midfielder = new Midfielder("Mason Mount",25,120);
        Striker striker = new Striker("Kai Havertz",70,23);
        club.addFootballPlayer(midfielder);
        club.addFootballPlayer(striker);
        String expected = "I'm a midfielder";
        String actual = this.club.teamIntroduce();
        assertEquals(expected,actual);
    }



}
