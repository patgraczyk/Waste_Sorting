package Rubbish.Organic;

import Interfaces.ICompostable;
import Rubbish.PieceOfRubbish;

public class Organic extends PieceOfRubbish implements ICompostable {

    public Organic(String itemName, int quantity, int weight) {
        super(itemName, quantity, weight);
    }

    @Override
    public String compost() {
        return "Item compostable";
    }
}
