package RubbishTest;

import Rubbish.Organic.NonPackagedOrganic;
import Rubbish.Organic.PackagedOrganic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganicTest {

    NonPackagedOrganic nonPackagedOrganic;
    PackagedOrganic packagedOrganic;

    @Before
    public void before(){
        nonPackagedOrganic = new NonPackagedOrganic("Apple", 5, 50);
        packagedOrganic = new PackagedOrganic("bluberries in container", 1, 200);
    }

    @Test
    public void hasName(){
        assertEquals("Apple", nonPackagedOrganic.getItemName());
        assertEquals("bluberries in container", packagedOrganic.getItemName());
    }

    @Test
    public void hasQuantity(){
        assertEquals(5, nonPackagedOrganic.getQuantity());
        assertEquals(1, packagedOrganic.getQuantity());
    }

    @Test
    public void hasWeight(){
        assertEquals(50, nonPackagedOrganic.getWeight(), 0);
        assertEquals(200, packagedOrganic.getWeight(), 0);

    }

    @Test
    public void getDisposalInfo(){
        assertEquals("Item compostable. This item might be recyclable, but wash it first", packagedOrganic.disposalInstructions());
    }
}
