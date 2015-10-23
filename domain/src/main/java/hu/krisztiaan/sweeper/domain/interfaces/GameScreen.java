package hu.krisztiaan.sweeper.domain.interfaces;

import hu.krisztiaan.sweeper.domain.data.field.Coordinate;
import hu.krisztiaan.sweeper.domain.data.player.Player;

public interface GameScreen {

    void start();

    void nextStep();

    void nextPlayer(Player nextPlayer);

    void bombAvailable();

    void pop(Coordinate coordinate, Player player);

    void bombSelect();

    void bomb(Coordinate coordinate, Player player);

    void setScore(Player player, int newScore);

    void setBombsLeft(int bombsLeft);

    void end(Player winner, Player loser);

    void rematch();

}
