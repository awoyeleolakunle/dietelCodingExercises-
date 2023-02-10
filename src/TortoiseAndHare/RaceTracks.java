package TortoiseAndHare;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RaceTracks {
    private String[][] lanes;

    public RaceTracks(){
        int numberOfLanes =2;
        int numberOfSquaresPerLane = 70;
        this.lanes = new String[numberOfLanes][numberOfSquaresPerLane];
        for (String[] lane: lanes) {
            Arrays.fill(lane,"");
        }

    }
    public void setLane(String[][] lanes){
        this.lanes = lanes;
    }

    public String[][] getLane() {
        return lanes;
    }


}
