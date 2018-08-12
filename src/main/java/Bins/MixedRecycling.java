package Bins;

import Interfaces.IRecyclable;
import Rubbish.PieceOfRubbish;

public class MixedRecycling extends Bin {
    public MixedRecycling(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    public boolean addToRecyclingBin(IRecyclable iRecyclable, MixedRecycling mixedRecycling){
        return mixedRecycling.addItemsToBin((PieceOfRubbish) iRecyclable);
    }
}
