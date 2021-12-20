public class Field {

    private int rows;
    private int columns;

    private Fieldable[][] field;

    public Field(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        field = new Fieldable[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setFieldable(int x, int y, Fieldable object) {

        field [x][y] = object;
    }

    public Fieldable getFieldable(int x, int y) {
        return field [x][y];
    }
public void showField(){

        System.out.println();
for (int i = 0; i < rows; i++){

System.out.println();

for (int q=0; q < columns; q++) {
    System.out.print(field[i][q].getSymbol());


}

    }
System.out.println();
}
}

