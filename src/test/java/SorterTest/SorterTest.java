package SorterTest;

import Bins.Bin;
import Bins.Glass;
import Bins.Landfill;
import Bins.MixedRecycling;
import Interfaces.ICompostable;
import Interfaces.IRecyclable;
import Interfaces.IReusable;
import Rubbish.Organic.PackagedOrganic;
import Rubbish.Plastics.HDPE;
import Rubbish.Plastics.PET1;
import Rubbish.Plastics.Vegware;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.manipulation.Sorter;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SorterTest {

    Glass glass;
    MixedRecycling mixedRecycling;
    Landfill landfill;
    ArrayList<IRecyclable> recyclingItems;
    ArrayList<ICompostable> compostItems;
    ArrayList<IReusable> reuseItems;
    PET1 pet1;
    HDPE hdpe;
    PackagedOrganic packagedOrganic;
    Vegware vegware;

    @Before
    public void before() {
        glass = new Glass( "Glass", 200, "Tuesday");
        mixedRecycling = new MixedRecycling("mixed recycling", 190, "Wednesday");
        landfill= new Landfill("landfill", 200, "Thursday");
        recyclingItems = new ArrayList<>();
        compostItems = new ArrayList<>();
        reuseItems = new ArrayList<>();
        pet1 = new PET1("straw", 2, 90, "PET1");
        hdpe = new HDPE( "chair", 1, 30, "HDPE");
        packagedOrganic = new PackagedOrganic("apple", 1, 40);
        vegware = new Vegware("cup", 2,2, "vegware");
    }

    @Test
    public void allCollectionsEmpty(){
        assertEquals(0, recyclingItems.size());
        assertEquals(0, compostItems.size());
        assertEquals(0, reuseItems.size());
    }

    @Test
    public void addToRecyclingCollection(){
        assertEquals(true, recyclingItems.add(pet1) );
    }

    @Test
    public void addToReusableCollection(){
        assertEquals(true, reuseItems.add(hdpe));
    }

    @Test
    public void addToCompostableCollection(){
        assertEquals(true, compostItems.add(packagedOrganic) );
        assertEquals(true, compostItems.add(vegware));

    }

    @Test
    public void addToBin(){
        assertEquals(true, mixedRecycling.addItemsToBin(pet1));
    }
}