package hu.krisztiaan.sweeper.domain.controls;


import java.util.ArrayList;
import java.util.List;

import hu.krisztiaan.sweeper.domain.data.player.Player;

public class PlayersHandler {
    public static final int PLAYERS_COUNT = 2;

    private int mCurrentPlayer;

    private List<Player> mPlayers;

    public void init() {
        mCurrentPlayer = 0;
        mPlayers = new ArrayList<>(PLAYERS_COUNT);
    }

    public Player nextPlayer() {
        if(mCurrentPlayer>=PLAYERS_COUNT-1) mCurrentPlayer = 0;
        return mPlayers.get(mCurrentPlayer++);
    }

    public int getCurrentPlayer() {
        return mCurrentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        mCurrentPlayer = currentPlayer;
    }

    public void addPlayer(Player player) {
        mPlayers.add(player);
    }

    public void setPlayers(List<Player> players) {
        mPlayers.clear();
        mPlayers.addAll(players);
    }
}
