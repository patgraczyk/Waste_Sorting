package Rubbish.Plastics;

import Rubbish.PieceOfRubbish;

public class Plastic extends PieceOfRubbish {

        private String plastictype;

        public Plastic(String itemName, int quantity, int weight, String plastictype) {
        super(itemName, quantity, weight);
        this.plastictype = plastictype;
    }



}