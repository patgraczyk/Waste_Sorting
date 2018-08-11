package Rubbish;

public abstract class PieceOfRubbish {

    private String itemName;
    private int quantity;
    private int weight;

    public PieceOfRubbish(String itemName, int quantity, int weight) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWeight() {
        return weight;
    }
}
