package Rubbish.Organic;

import Interfaces.IRecyclable;
import Rubbish.PieceOfRubbish;

public class PackagedOrganic extends Organic implements IRecyclable {

    public PackagedOrganic(String itemName, int quantity, int weight) {
        super(itemName, quantity, weight);
    }


    @Override
    public String recycle() {
        return "This item might be recyclable, but wash it first";
    }

    public String disposalInstructions(){
        return compost() + ". " + recycle();
    }
}
