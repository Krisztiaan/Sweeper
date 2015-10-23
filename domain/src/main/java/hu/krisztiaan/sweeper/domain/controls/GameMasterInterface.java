package hu.krisztiaan.sweeper.domain.controls;

import java.util.List;

import hu.krisztiaan.sweeper.domain.data.player.Player;

/**
 * Created by krisz on 2015. 10. 04..
 */
public interface GameMasterInterface {
    void setPlayers(List<Player> players);
    void onMineClick(int row, int column);
    void onBombSelect();
    void onBombDrop(int row, int column);
}
