import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jim", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
