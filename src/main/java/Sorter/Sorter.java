package Sorter;

import Bins.Bin;
import Bins.MixedRecycling;
import Interfaces.ICompostable;
import Interfaces.IRecyclable;
import Interfaces.IReusable;
import Rubbish.PieceOfRubbish;

import java.util.ArrayList;


public class Sorter {

    private ArrayList<IRecyclable> recyclingItems;
    private ArrayList<ICompostable> compostItems;
    private ArrayList<IReusable> reuseItems;

    public Sorter(){
        recyclingItems = new ArrayList<>();
        compostItems = new ArrayList<>();
        reuseItems = new ArrayList<>();
    }


    public ArrayList<IRecyclable> getRecycling() {
        return recyclingItems;
    }

    public ArrayList<ICompostable> getCompost() {
        return compostItems;
    }

    public ArrayList<IReusable> getReuse() {
        return reuseItems;
    }

    public boolean addToRecycling(IRecyclable iRecyclable, Bin bin){
    return bin.addItemsToBin((PieceOfRubbish) iRecyclable);
    }


}

//    add trash to the bin
//    check capacity of the bin before adding
//    empty bin