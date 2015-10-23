package hu.krisztiaan.sweeper.domain.interfaces;

import hu.krisztiaan.sweeper.domain.data.field.Coordinate;
import hu.krisztiaan.sweeper.domain.data.player.Player;

/**
 * Created by krisz on 2015. 10. 13..
 */
public interface GameControl {

    void start(Player player1, Player player2);

    void resumeGame();

    void pop(Coordinate point);

    void bombSelect();

    void bomb(Coordinate point);

    void askRematch(Player player);



}
