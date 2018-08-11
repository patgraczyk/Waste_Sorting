package Rubbish.Plastics;

import Interfaces.ICompostable;
import Rubbish.PieceOfRubbish;

public class Vegware extends Plastic implements ICompostable {
    public Vegware(String itemName, int quantity, double weight, String plastictype) {
        super(itemName, quantity, weight, plastictype);
    }

    @Override
    public void compost(PieceOfRubbish pieceOfRubbish) {

    }
}

//can be composted