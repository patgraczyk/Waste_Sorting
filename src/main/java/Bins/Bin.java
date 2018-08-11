package Bins;

import Rubbish.PieceOfRubbish;

import java.util.ArrayList;

public abstract class Bin {

    private String type;
    private double weightCapacity;
    private String collectionDay;
    private ArrayList<PieceOfRubbish> allRubbish;

    public Bin (String type, double weightCapacity, String collectionDay){
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
}
