package BinsTest;

import Bins.Compost;
import Bins.Glass;
import Bins.Landfill;
import Bins.MixedRecycling;
import Rubbish.PieceOfRubbish;
import Rubbish.Plastics.HDPE;
import Rubbish.Plastics.PET1;
import Rubbish.Plastics.Plastic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinsTest {

    Compost compost;
    Glass glass;
    Landfill landfill;
    MixedRecycling mixedRecycling;
    PET1 pet1;
    Plastic plastic;

    @Before
    public void before(){
        compost = new Compost("compost", 50, "Thursday");
        glass = new Glass("glass", 70, "Monday");
        landfill = new Landfill("landfill waste", 60, "Tuesday");
        mixedRecycling = new MixedRecycling("mixed recycling", 40, "Wednesday");
        pet1 = new PET1("cup", 40, 40, "PET1");
        plastic = new Plastic("straw", 40, 1, "HDPE");
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

    @Test
    public void addItemToBin(){
        assertEquals(true, mixedRecycling.addItemsToBin(pet1));
    }

    @Test
    public void addPlasticToBin(){
        assertEquals(true, mixedRecycling.addItemsToBin(plastic));
    }

    @Test
    public void binFullCantAddTrash(){
        landfill = new Landfill("landfill waste", 5, "Tuesday");
        pet1 = new PET1("cup", 40, 40, "PET1");
        assertEquals(false, landfill.addItemsToBin(pet1));
    }

    @Test
    public void checkWeightOfBin(){
        glass.addItemsToBin(pet1);
        glass.addItemsToBin(plastic);
        assertEquals(2, glass.getRubbish().size());
        assertEquals(41.0, glass.getWeightOfItemsInBin(), 0);
    }

    @Test
    public void binChargesForPieceOfTrash(){
        assertEquals(100.0, glass.priceForPieceOfTrash(pet1), 0);
        assertEquals(400.0, landfill.priceForPieceOfTrash(pet1), 0);
    }

    @Test
    public void binTotalChargeForTrash(){
        glass.addItemsToBin(pet1);
        glass.addItemsToBin(plastic);
        assertEquals(102.5, glass.getPriceOfItemsInBin(), 0);
    }

    @Test
    public void binTotalChargeForTrashLandfill(){
        landfill.addItemsToBin(pet1);
        landfill.addItemsToBin(plastic);
        assertEquals(410.0, landfill.getPriceOfItemsInBin(), 0);
    }

    @Test
    public void addToBin(){
        assertEquals(true, mixedRecycling.addToRecyclingBin(pet1,mixedRecycling));
    }

}
