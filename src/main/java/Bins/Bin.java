package Bins;

import Interfaces.IRecyclable;
import Rubbish.PieceOfRubbish;

import java.util.ArrayList;

public abstract class Bin {

    private String type;
    private double weightCapacity;
    private String collectionDay;
    private ArrayList<PieceOfRubbish> allRubbish;

    public Bin(String type, double weightCapacity, String collectionDay) {
        this.type = type;
        this.weightCapacity = weightCapacity;
        this.collectionDay = collectionDay;
        this.allRubbish = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public String getCollectionDay() {
        return collectionDay;
    }

    public ArrayList<PieceOfRubbish> getRubbish() {
        return allRubbish;
    }


    public boolean addItemsToBin(PieceOfRubbish pieceOfRubbish) {
        if ((pieceOfRubbish.getWeight() + getWeightOfItemsInBin()) <= this.weightCapacity) {
            allRubbish.add(pieceOfRubbish);
            return true;
        } else {
            return false;
        }
    }

    public double getWeightOfItemsInBin(){
        double weightTotal = 0;
        for(PieceOfRubbish pieceOfRubbish : allRubbish ){
            weightTotal += pieceOfRubbish.getWeight();
        }
        return weightTotal;
    }

    public double getBinCapacityRemaining(){
        return (1-(getWeightOfItemsInBin()/weightCapacity))*100;
    }



}

