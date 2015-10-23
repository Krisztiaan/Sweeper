package hu.krisztiaan.sweeper.domain.controls;


import hu.krisztiaan.sweeper.domain.data.field.MineTable;

public class MineFieldHandler {
    public static final int TABLE_ROWS = 16;
    public static final int TABLE_COLUMNS = 16;
    public static final int TABLE_MINES = 51;

    private final MineTable mMineTable = new MineTable(TABLE_ROWS, TABLE_COLUMNS);

    MineFieldGenerator mGenerator;

    public void init() {
        mGenerator.setTable(mMineTable);
    }

    public void generateFields() {
        mGenerator.clearTable();
        mGenerator.placeMines(TABLE_MINES);
        mGenerator.calculateHints();
    }

    public void simpleMove(int row, int column) {

    }

    public void bombMove(int row, int column) {

    }

    public MineTable getMineTable() {
        return mMineTable;
    }
}
