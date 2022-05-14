package plane;

import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> cockpitCrew;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;

    //CONSTRUCTOR

    public Flight(ArrayList<Pilot> cockpitCrew, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNumber, String destination, String departureTime) {
        this.cockpitCrew = cockpitCrew;
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    //GETTERS

    public ArrayList<Pilot> getCockpitCrew() {
        return cockpitCrew;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    //ADD PASSENGER

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() < plane.getPlaneType().getCapacity()) {
            passengers.add(passenger);
        }
    }
}
