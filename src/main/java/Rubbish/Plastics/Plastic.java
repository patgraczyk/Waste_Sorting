package Rubbish.Plastics;

import Rubbish.PieceOfRubbish;

public class Plastic extends PieceOfRubbish {

        private String plastictype;
        private double conversionFactor;

        public Plastic(String itemName, int quantity, double weight, String plastictype, double conversionFactor) {
        super(itemName, quantity, weight);
        this.plastictype = plastictype;
        this.conversionFactor = conversionFactor;
    }

    public String getPlastictype() {
        return plastictype;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public double productEmissions(){
            return (getConversionFactor() * this.getQuantity() * this.getWeight())/100;
        }


}