package people;

public class Pilot extends CabinCrewMember {

    private String pilotLicence;

    public Pilot(String name, RankType rankType, String pilotLicence) {
        super(name, rankType);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }
}
