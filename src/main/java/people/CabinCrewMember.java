package people;

public class CabinCrewMember extends Person{

    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType) {
        super(name);
        this.rankType = rankType;
    }

    public RankType getRankType() {
        return rankType;
    }

    //Advanced Methods

    public String relayMessage() {
        return "This is an announcement!";
    }
}
