package Bins;

import Interfaces.IChargable;
import Rubbish.PieceOfRubbish;

import java.util.ArrayList;

public class Glass extends Bin implements IChargable {


    public Glass(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }


    @Override
    public double unitPrice() {
        return 2.50;
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
