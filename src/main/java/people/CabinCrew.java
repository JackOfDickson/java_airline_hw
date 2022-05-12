package people;

public class CabinCrew extends Person{

    private RankType rankType;

    public CabinCrew(String name, RankType rankType) {
        super(name);
        this.rankType = rankType;
    }

    public RankType getRankType() {
        return rankType;
    }
}
