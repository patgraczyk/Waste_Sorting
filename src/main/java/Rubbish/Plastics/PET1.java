package Rubbish.Plastics;

import Bins.Bin;
import Interfaces.IRecyclable;
import Rubbish.ConversionFactorPlastic;
import Rubbish.PieceOfRubbish;
import Sorter.Sorter;

public class PET1 extends Plastic implements IRecyclable {
    public PET1(String itemName, int quantity, double weight, String plastictype, ConversionFactorPlastic plasticType) {
        super(itemName, quantity, weight, plastictype, plasticType.getConversionFactor());
    }

    @Override
    public String recycle() {
        return "This item is recyclable";
    }

}

//Can be recycled