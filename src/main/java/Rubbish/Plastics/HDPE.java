package Rubbish.Plastics;

import Interfaces.IReusable;
import Rubbish.ConversionFactorPlastic;
import Rubbish.PieceOfRubbish;

public class HDPE extends Plastic implements IReusable {
    public HDPE(String itemName, int quantity, double weight, String plastictype, ConversionFactorPlastic plasticType) {
        super(itemName, quantity, weight, plastictype, plasticType.getConversionFactor());
    }

    @Override
    public String reuse() {
        return "You can reuse this item, don't through it away";
    }
}

//can be repurposed