package Sorter;

import Bins.Bin;
import Interfaces.IRecyclable;
import Rubbish.PieceOfRubbish;

public class Sorter {

    public boolean addToRecycling(IRecyclable iRecyclable, Bin bin){
    return bin.addItemsToBin((PieceOfRubbish) iRecyclable);
    }
}

//    add trash to the bin
//    check capacity of the bin before adding
//    empty bin