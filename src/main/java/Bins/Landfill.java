package Bins;

import Interfaces.IChargable;
import Rubbish.PieceOfRubbish;

public class Landfill extends Bin implements IChargable {
    public Landfill(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    @Override
    public double unitPrice() {
        return 10.00;
    }

    @Override
    public double priceForPieceOfTrash(PieceOfRubbish pieceOfRubbish) {
        return unitPrice() * pieceOfRubbish.getWeight();
    }

    public double getPriceOfItemsInBin(){
        double weightTotal = 0;
        for(PieceOfRubbish pieceOfRubbish : getRubbish() ){
            weightTotal += pieceOfRubbish.getWeight();
        }
        return weightTotal * unitPrice();
    }
}
