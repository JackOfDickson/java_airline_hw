import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.RankType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrewMember("Jane", RankType.FlightAttendant);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FlightAttendant, cabinCrew.getRankType());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("This is an announcement!", cabinCrew.relayMessage());
    }
}
