package TortoiseAndHare;

public class RaceCourse {
    private RaceTracks raceTracks;
    private static final Pail pail =new Pail();

    public RaceCourse(){
        this.raceTracks = new RaceTracks();
    }
    public RaceTracks getRaceTracks(){
        return raceTracks;
    }

    public Pail  getPail() {
        return pail;
    }
}
