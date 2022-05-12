import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.RankType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jane", RankType.FlightAttendant);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FlightAttendant, cabinCrew.getRankType());
    }
}
