import java.util.Objects;

public class Flower implements  Fieldable {

    private int pollen;

    private  int rowIndex;
    private  int columnIndex;



    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public int getPollen() {
        return pollen;
    }

    public Flower(int pollen, int rowIndex, int ColumnIndex) {
        this.pollen = pollen;
        this.rowIndex=rowIndex;
        this.columnIndex=columnIndex;

    }
    public String getSymbol() {
        return String.valueOf(" " + pollen + " ") ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return rowIndex == flower.rowIndex && columnIndex == flower.columnIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowIndex, columnIndex);
    }
}
