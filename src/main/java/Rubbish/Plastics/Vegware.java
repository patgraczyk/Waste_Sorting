package Rubbish.Plastics;

import Interfaces.ICompostable;
import Rubbish.ConversionFactorPlastic;
import Rubbish.PieceOfRubbish;

public class Vegware extends Plastic implements ICompostable {
    public Vegware(String itemName, int quantity, double weight, String plastictype, ConversionFactorPlastic plasticType) {
        super(itemName, quantity, weight, plastictype, plasticType.getConversionFactor());
    }

    @Override
    public String compost() {
        return "This item is compostable";
    }
}

//can be composted