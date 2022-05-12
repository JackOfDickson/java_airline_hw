import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.RankType;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Barney", RankType.Captain, "12ADGF");
    }

    @Test
    public void hasName(){
        assertEquals("Barney", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.Captain, pilot.getRankType());
    }

    @Test
    public void hasPilotLicence(){
        assertEquals("12ADGF", pilot.getPilotLicence());
    }
}
