package Interfaces;

import Bins.Bin;
import Rubbish.PieceOfRubbish;
import Sorter.Sorter;

public interface IRecyclable {

   void recycle(PieceOfRubbish pieceOfRubbish);
}