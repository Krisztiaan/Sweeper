package hu.krisztiaan.sweeper.domain.data.field;

import java.security.InvalidParameterException;

public class GameField {

    public final FieldType mFieldType;
    public final int mNumValue;
    public boolean mIsRevealed = false;

    public GameField(FieldType fieldType, int numValue) {
        mFieldType = fieldType;
        mNumValue = numValue;
    }

    public GameField(FieldType fieldType) {
        if(fieldType ==FieldType.NUMBER) throw new InvalidParameterException("You need to set the int value for NUMBER type");
        mFieldType = fieldType;
        mNumValue = 0;
    }

    public FieldType getFieldType() {
        return mFieldType;
    }

    public int getNumValue() {
        return mNumValue;
    }

    public boolean isRevealed() {
        return mIsRevealed;
    }

    public void setIsRevealed(boolean isRevealed) {
        mIsRevealed = isRevealed;
    }
}
