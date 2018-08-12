package SorterTest;

import Bins.Glass;
import Bins.Landfill;
import Bins.MixedRecycling;
import org.junit.Before;
import org.junit.Test;

public class SorterTest {

    Glass glass;
    MixedRecycling mixedRecycling;
    Landfill landfill;

    @Before
    public void before() {
        glass = new Glass( "Glass", 200, "Tuesday");
        mixedRecycling = new MixedRecycling("mixed recycling", 190, "Wednesday");
        landfill= new Landfill("landfill", 200, "Thursday");
    }

    @Test
    public void allBinsEmpty(){

    }
}