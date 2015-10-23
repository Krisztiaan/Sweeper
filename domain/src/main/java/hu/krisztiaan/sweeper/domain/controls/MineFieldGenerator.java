package hu.krisztiaan.sweeper.domain.controls;


import java.util.Random;

import hu.krisztiaan.sweeper.domain.data.field.FieldType;
import hu.krisztiaan.sweeper.domain.data.field.GameField;
import hu.krisztiaan.sweeper.domain.data.field.MineTable;

public class MineFieldGenerator {
    private MineTable mTable;
    GameField emptyField = new GameField(FieldType.NULL);

    public MineFieldGenerator(MineTable field) {
        mTable = field;
    }

    public void setTable(MineTable field) {
        mTable = field;
    }


        public void clearTable() {
        for (int x = 0; x < mTable.getNumColumns(); x++) {
            for (int y = 0; y < mTable.getNumRows(); y++) {
                mTable.setField(x, y, emptyField);
            }
        }
    }

    public void placeMines(int mines) {
        int minesPlaced = 0;
        Random random = new Random();

        while (minesPlaced < mines) {
            int x = random.nextInt(mTable.getNumRows());
            int y = random.nextInt(mTable.getNumColumns());

            if (mTable.getField(x, y) == null ||
                    mTable.getField(x, y).getFieldType() != FieldType.MINE) {
                mTable.setField(x, y, new GameField(FieldType.MINE));
                minesPlaced++;
            }
        }
    }

    public void calculateHints() {
        for (int y = 0; y < mTable.getNumColumns(); y++) {
            for (int x = 0; x < mTable.getNumRows(); x++) {
                if (mTable.getField(x, y) == emptyField) {
                    mTable.setField(x, y, minesNear(x,y));
                }
            }
        }
    }

    public GameField minesNear(int x, int y) {
        int mines = 0;
        // check mines in all directions
        mines += mineAt(x - 1, y - 1);
        mines += mineAt(x - 1, y);
        mines += mineAt(x - 1, y + 1);
        mines += mineAt(x, y - 1);
        mines += mineAt(x, y + 1);
        mines += mineAt(x + 1, y - 1);
        mines += mineAt(x + 1, y);
        mines += mineAt(x + 1, y + 1);
        if (mines > 0) {
            return new GameField(FieldType.NUMBER, mines);
        } else {
            return new GameField(FieldType.ZERO);
        }
    }

    public int mineAt(int x, int y) {
        if (y >= 0 &&
                y < mTable.getNumColumns() &&
                x >= 0 &&
                x < mTable.getNumRows() &&
                mTable.getField(x,y).getFieldType() == FieldType.MINE) {
            return 1;
        } else {
            return 0;
        }
    }
}
