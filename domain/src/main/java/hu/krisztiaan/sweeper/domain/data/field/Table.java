package hu.krisztiaan.sweeper.domain.data.field;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krisz on 2015. 10. 04..
 */
public class Table<T> {
    private final List<List<T>> mRows;

    private int mNumRows, mNumColumns;

    public Table(int numRows, int numColumns) {
        this.mNumRows = numRows;
        this.mNumColumns = numColumns;
        mRows = new ArrayList<>(numRows);
        for (List row :
                mRows) {
            row = new ArrayList<>(numColumns);
        }
    }

    public void setField(int row, int column, T value) {
        mRows.get(row).add(column, value);
    }

    public T getField(int row, int column) {
        return mRows.get(row).get(column);
    }

    public int getNumRows() {
        return mNumRows;
    }

    public int getNumColumns() {
        return mNumColumns;
    }
}
