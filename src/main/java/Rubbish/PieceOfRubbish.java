package Rubbish;

public abstract class PieceOfRubbish {

    private String itemName;
    private int quantity;
    private double weight;

    public PieceOfRubbish(String itemName, int quantity, double weight) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }



}
