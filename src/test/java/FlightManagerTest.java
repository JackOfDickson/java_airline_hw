import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.RankType;
import plane.Flight;
import plane.FlightManager;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Pilot pilot;
    ArrayList<Pilot> cockpitCrew;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;
    ArrayList<CabinCrewMember> cabinCrewArray;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;
    Flight flight;
    FlightManager flightManager;

    @Before
    public void before(){
        pilot = new Pilot("David", RankType.Captain, "yes");
        cockpitCrew = new ArrayList<>(Arrays.asList(pilot));
        cabinCrewMember= new CabinCrewMember("Lucy", RankType.FlightAttendant);
        cabinCrewMember1 = new CabinCrewMember("Peter", RankType.Purser);
        cabinCrewArray = new ArrayList<>(Arrays.asList(cabinCrewMember, cabinCrewMember1));
        passenger = new Passenger("Steven", 2);
        passenger1 = new Passenger("Carl", 5);
        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(
                cockpitCrew,
                cabinCrewArray,
                plane,
                "12A",
                "EDI",
                "16:45"
        );
        flightManager = new FlightManager(flight);

    }

    @Test
    public void canReturnBaggageAllowance(){
        assertEquals(5, flightManager.baggageAllowancePerPassenger(), 0.0);
    }

    @Test
    public void canTotalBaggageBooked(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        assertEquals(7, flightManager.totalBaggageBooked(), 0.0);
    }

    @Test
    public void canReturnRemainBaggageCapacity(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        assertEquals(13, flightManager.remainingBaggageSpace(), 0.0);
    }
}
