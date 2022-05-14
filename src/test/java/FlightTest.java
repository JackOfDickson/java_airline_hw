import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.RankType;
import plane.Flight;
import plane.Plane;
import plane.PlaneType;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    ArrayList<Pilot> cockpitCrew;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;
    ArrayList<CabinCrewMember> cabinCrewArray;
    Passenger passenger;
    Plane plane;
    Flight flight;
    Date date;

    @Before
    public void before(){
        pilot = new Pilot("David", RankType.Captain, "yes");
        cockpitCrew = new ArrayList<>(Arrays.asList(pilot));
        cabinCrewMember= new CabinCrewMember("Lucy", RankType.FlightAttendant);
        cabinCrewMember1 = new CabinCrewMember("Peter", RankType.Purser);
        cabinCrewArray = new ArrayList<>(Arrays.asList(cabinCrewMember, cabinCrewMember1));
        passenger = new Passenger("Steven", 1);
        plane = new Plane(PlaneType.BOEING747);
        date = new Date(2022,0,26,16,30);

        flight = new Flight(
                cockpitCrew,
                cabinCrewArray,
                plane,
                "12A",
                "EDI",
                date
                );
    }
    @Test
    public void hasCockpitCrew(){
        assertEquals(cockpitCrew, flight.getCockpitCrew());
    }

    @Test
    public void hasCabinCrew(){
        assertEquals(cabinCrewArray, flight.getCabinCrew());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("12A", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("Thu Jan 26 16:30:00 GMT 3922", flight.getDepartureTime().toString());
    }

    //Advanced Methods

    @Test
    public void canAddPassengers(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test public void cannotAddPassengersBeyondCapacity(){
        //tries to add 5 passengers but plane has capacity of 4
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(4, flight.getPassengers().size());
    }

    @Test
    public void canReturnAvailableSeats(){
        assertEquals(4, flight.returnAvailableSeats());
    }
}
