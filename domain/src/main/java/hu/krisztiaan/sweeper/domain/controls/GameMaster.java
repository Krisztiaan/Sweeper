package hu.krisztiaan.sweeper.domain.controls;

import hu.krisztiaan.sweeper.domain.data.field.Coordinate;
import hu.krisztiaan.sweeper.domain.data.player.Player;
import hu.krisztiaan.sweeper.domain.interfaces.GameControl;

public class GameMaster implements GameControl{

    private Player player1, player2;

    @Override
    public void start(Player player1, Player player2) {

    }

    @Override
    public void resumeGame() {

    }

    @Override
    public void pop(Coordinate point) {

    }

    @Override
    public void bombSelect() {

    }

    @Override
    public void bomb(Coordinate point) {

    }

    @Override
    public void askRematch(Player player) {

    }
}
