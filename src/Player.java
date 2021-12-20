public class Player implements  Fieldable{
    private static final String VLEVO = "a";
    private static final String VPRAVO = "d";
    private static final String VVERH = "w";
    private static final String VNIZ = "s";
    private static final String NICHEGO = "e";

    private int rowIndex;
    private int columnIndex;
    private Game game;
    private Field field;

    public String getSymbol() {
        return " \uD80C\uDDA4 ";
    }

    public Player(int rowIndex, int columnIndex, Game game) {

this.rowIndex= rowIndex;
this.columnIndex= columnIndex;
this.game=game;
this.field=game.getField();
field.setFieldable(rowIndex, columnIndex, this);
    }

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

 public void makeMove (String command) {

switch (command) {

    case VLEVO:
        movePlayer(0, -1);
break;
case VPRAVO:
        movePlayer(0, 1);
        break;

    case VVERH:
        movePlayer(-1, 0);

break;



    case VNIZ:
        movePlayer(1,0);
break;

    case NICHEGO:
break;
    default:
showError(command);
break;
 }
 }



    private void movePlayer (int deltaRowIndex, int deltaColumnIndex){

        int newRowIndex = rowIndex + deltaRowIndex;
        int newColumnIndex = columnIndex + deltaColumnIndex;
        
        if((newRowIndex>=0) && (newRowIndex < field.getColumns()) && (newColumnIndex >= 0) && (newColumnIndex < field.getRows())   && !((field.getFieldable(newRowIndex, newColumnIndex ))

        instanceof Enemy))

if(field.getFieldable(newRowIndex,newColumnIndex ) instanceof Flower)

{

Flower flower = (Flower) field.getFieldable(newRowIndex, newColumnIndex);
game.setPollenGatherd(flower.getPollen());
game.getFlowerArrayList().remove(flower);
  swapPlayer( newRowIndex, newColumnIndex);

}

if (field.getFieldable(newRowIndex ,newColumnIndex) instanceof Empty)
swapPlayer(newRowIndex ,newColumnIndex);

            }



private void swapPlayer( int newRowIndex ,int newColumnIndex){

    field.setFieldable(newRowIndex, newColumnIndex ,this);
    field.setFieldable( rowIndex, columnIndex , new Empty());
    rowIndex=newRowIndex;
    columnIndex=newColumnIndex;
}

    private void showError(String command) {
    System.out.println("Команды " + command + " не существует : (");
    }

}