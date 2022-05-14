package plane;

import people.Passenger;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double baggageAllowancePerPassenger(){
        return flight.getPlane().getPlaneType().getTotalWeight()/flight.getPlane().getPlaneType().getCapacity();
        //Above is (TotalWeight)/(Max Passengers)
    }

    public double totalBaggageBooked() {
        int baggageBookedWeight = 0;
        for (int i=0; i < flight.getPassengers().size(); i++){
            Passenger currentPassenger = flight.getPassengers().get(i);
            baggageBookedWeight += currentPassenger.getNumberOfBags();
        }
        return baggageBookedWeight;
    }
}
