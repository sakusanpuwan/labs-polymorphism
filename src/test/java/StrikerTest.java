import footballPlayer.Striker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikerTest {

    private Striker striker;


    @BeforeEach
    public void setUp(){
        this.striker = new Striker("Kai Havertz",70,23);
        this.striker.setTotalGoals(0);
        this.striker.setTotalShots(0);

    }

    @Test
    public void canBeMotivated(){
        striker.setMorale(5);
        int expected = 7;
        striker.motivatePlayer();
        int actual = striker.getMorale();
        assertEquals(expected,actual);
    }

    @Test
    public void canScoreGoal(){
        int expected = 2;
        striker.scoreGoal();
        striker.scoreGoal();
        int actual = striker.getTotalGoals();
        assertEquals(expected,actual);
    }

    @Test
    public void canTakeShot(){
        int expected = 1;
        striker.takeShot();
        int actual = striker.getTotalShots();
        assertEquals(expected,actual);

    }

    @Test
    public void canCelebrateGoal(){
        String expected = "kneeslide";
        String actual = striker.celebrateGoal();
        assertEquals(expected,actual);
    }

    @Test
    public void canCelebrateGoalSpecified(){
        String expected = "somersault";
        String actual = striker.celebrateGoal("somersault");
        assertEquals(expected,actual);
    }

    @Test
    public void canIntroduce(){
        String expected = "I'm a striker";
        String actual = striker.introduce();
    }

    @Test
    public void canSetTactics(){
        String expected = "You're playing tiki taka football";
        String actual = striker.setTactics("tiki taka");
        assertEquals(expected,actual);
    }
}
