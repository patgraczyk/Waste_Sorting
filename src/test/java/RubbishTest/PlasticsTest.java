package RubbishTest;

import Interfaces.IRecyclable;
import Rubbish.Plastics.HDPE;
import Rubbish.Plastics.PET1;
import Rubbish.Plastics.Plastic;
import Rubbish.Plastics.Vegware;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlasticsTest {

    HDPE hdpe;
    Vegware vegware;
    PET1 pet1;
    IRecyclable iRecyclable;

    @Before
    public void before(){
        hdpe = new HDPE( "Cup", 1, 30, "HDPE");
        vegware = new Vegware("plastic fork", 2, 40, "Vegware");
        pet1 = new PET1("straw", 1, 15, "Pet1");
    }

    @Test
    public void hasName(){
        assertEquals("Cup", hdpe.getItemName());
        assertEquals("straw", pet1.getItemName());
    }

    @Test
    public void hasQuantity(){
        assertEquals(1, pet1.getQuantity());
        assertEquals(1, pet1.getQuantity());
    }

    @Test
    public void hasWeight(){
        assertEquals(40, vegware.getWeight(), 0);
        assertEquals(15, pet1.getWeight(), 0);
    }

    @Test
    public void recyclingInstructions(){
        assertEquals("This item is recyclable", pet1.recycle());
    }

    @Test
    public void itemIsCompostable(){
        assertEquals("This item is compostable", vegware.compost());
    }

    @Test
    public void itemIsReusable(){
        assertEquals("You can reuse this item, don't through it away", hdpe.reuse());
    }

}
