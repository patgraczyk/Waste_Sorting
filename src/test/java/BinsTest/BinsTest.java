package BinsTest;

import Bins.Compost;
import Bins.Glass;
import Bins.Landfill;
import Bins.MixedRecycling;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinsTest {

    Compost compost;
    Glass glass;
    Landfill landfill;
    MixedRecycling mixedRecycling;

    @Before
    public void before(){
        compost = new Compost("compost", 50, "Thursday");
        glass = new Glass("glass", 70, "Monday");
        landfill = new Landfill("landfill waste", 60, "Tuesday");
        mixedRecycling = new MixedRecycling("mixed recycling", 40, "Wednesday");
    }

    @Test
    public void binHasType(){
        assertEquals( "compost", compost.getType());
        assertEquals("glass", glass.getType());
        assertEquals("mixed recycling", mixedRecycling.getType());
    }

    @Test
    public void binHasCollectionDay(){
        assertEquals("Tuesday", landfill.getCollectionDay());
        assertEquals("Thursday", compost.getCollectionDay());
        assertEquals("Monday", glass.getCollectionDay());
    }

    @Test
    public void binHasCapacity(){
        assertEquals(60, landfill.getWeightCapacity(),0);
        assertEquals(40, mixedRecycling.getWeightCapacity(), 0 );
        assertEquals(70, glass.getWeightCapacity(), 0);

    }

    @Test
    public void binIsEmpty(){
        assertEquals(0, compost.getRubbish().size());
        assertEquals(0, landfill.getRubbish().size());
        assertEquals(0, glass.getRubbish().size());
    }
}
