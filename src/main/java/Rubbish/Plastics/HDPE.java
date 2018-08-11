package Rubbish.Plastics;

import Interfaces.IReusable;
import Rubbish.PieceOfRubbish;

public class HDPE extends Plastic implements IReusable {
    public HDPE(String itemName, int quantity, double weight, String plastictype) {
        super(itemName, quantity, weight, plastictype);
    }

    @Override
    public void reuse(PieceOfRubbish pieceOfRubbish) {

    }
}

//can be repurposed