package Interfaces;

import Rubbish.PieceOfRubbish;

public interface IChargable {

    public double unitPrice();
    public double priceForPieceOfTrash(PieceOfRubbish pieceOfRubbish);
}

//introduces charging / weight on specific types of bins