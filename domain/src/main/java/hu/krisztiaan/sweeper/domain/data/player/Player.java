package hu.krisztiaan.sweeper.domain.data.player;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import hu.krisztiaan.sweeper.domain.data.field.Coordinate;

/**
 * Created by krisz on 2015. 10. 04..
 */
public class Player implements Serializable {

    public final int id;

    public final String name;

    public final PlayerDesign design;

    public int score = 0;

    public final List<Coordinate> popList = new LinkedList<>();

    public boolean isActive = false;

    public Player(int id, String name, PlayerDesign design) {
        this.id = id;
        this.name = name;
        this.design = design;
    }
}
