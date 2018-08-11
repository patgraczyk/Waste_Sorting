package Rubbish.Plastics;

import Bins.Bin;
import Interfaces.IRecyclable;
import Rubbish.PieceOfRubbish;
import Sorter.Sorter;

public class PET1 extends Plastic implements IRecyclable {
    public PET1(String itemName, int quantity, double weight, String plastictype) {
        super(itemName, quantity, weight, plastictype);
    }

    @Override
    public void recycle(PieceOfRubbish pieceOfRubbish) {
        ;
    }

}

//Can be recycled