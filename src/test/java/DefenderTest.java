import footballPlayer.Defender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefenderTest {
    private Defender defender;

    @BeforeEach
    public void setUp(){
        this.defender = new Defender("Thiago Silva",20,37);
        this.defender.setTotalCleanSheets(0);
        this.defender.setTotalTackles(0);
    }

    @Test
    public void canBeMotivated(){
        int expected = 7;
        defender.motivatePlayer();
        int actual = defender.getMorale();
        assertEquals(expected,actual);
    }

    @Test
    public void canTackle(){
        int expected = 2;
        defender.tackle();
        defender.tackle();
        int actual = defender.getTotalTackles();
        assertEquals(expected,actual);
    }

    @Test
    public void canKeepCleanSheet(){
        int expected = 1;
        defender.keepCleanSheet();
        int actual = defender.getTotalCleanSheets();
        assertEquals(expected,actual);

    }
}
