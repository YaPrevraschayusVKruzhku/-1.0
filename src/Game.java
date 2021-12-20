import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game  {

    private  int rows;                    //ряды
    private  int columns;                //столбцы
    private  int quantityOfBeatles;     //жуки (враги)
    private  int amountOfPollen;       //пыльца
    private int motionsLeft;          //ходов осталось
    private int pollenGatherd;       //собрано пыльцы
    private int amountOfFlowers;    //цветы
    private boolean isGameFinished = false;
    private ArrayList<Flower> flowerArrayList=new ArrayList<Flower>();
    private Field field;
private Random randomNumber = new Random();
private Player player;
private Scanner sc= new Scanner(System.in);
    public Game (int rows, int columns, int quantityOfBeatles, int amountOfPollen, int motionsLeft, int amountOfFlowers) {
        this.rows = rows;
        this.columns = columns;
        this.quantityOfBeatles = quantityOfBeatles;
        this.amountOfPollen = amountOfPollen;
        this.motionsLeft = motionsLeft;
        this.amountOfFlowers= amountOfFlowers;

        field = new Field (rows, columns);

    }


public  Field getField(){
        return this.field;
}

public  ArrayList <Flower> getFlowerArrayList(){

        return this.flowerArrayList;

}

public void setPollenGatherd(int pollenToAdd){

this.pollenGatherd +=pollenToAdd;

}

    public void fillFieldWithEmptyObjects (){

        for (int i=0; i< rows; i++) {
            for (int q = 0; q < columns; q++) {
              field.setFieldable(i, q, new Empty());

            }
        }
    }

    public void startGame(){

        possessPlayer();
        posesEnemies();
        PossesFlowers();


        while(!isGameFinished) {

showField();
playerTurn();
computerTurn();
chekIfGameNotFinished();

        }
    }
    private void possessPlayer() {
        int vk = randomNumber.nextInt(rows);
        int tg = randomNumber.nextInt(columns);
player = new Player(vk, tg, this);

    }

    private void playerTurn(){

System.out.println("Передвигайся на " + "a, " + "s, " + "w, " + "d, ");

String jo = sc.nextLine();
player.makeMove(jo);
    }

    private void computerTurn() {}

    private void chekIfGameNotFinished() {

        if (motionsLeft==0) {
System.out.println("ИГРА ОКОНЧЕНА");
            isGameFinished=true;
        }
else if (pollenGatherd>=amountOfPollen){
System.out.println("ПОБЕДА!!!");
isGameFinished=true;
        }
    }



    private void showField() {
      System.out.println ("\n\nОсталось ходов: " + motionsLeft + "\nСобрано " + pollenGatherd + " пыльцы из " + amountOfPollen);

        field.showField();
    }

    private void PossesFlowers() {

for (int i = amountOfFlowers-flowerArrayList.size(); i>0;) {

int flowerAmountOfPollen = randomNumber.nextInt(9)+1; //транзисторы на цветках
int flowerRowPosition = randomNumber.nextInt(rows);
int flowerColumnPosition = randomNumber.nextInt(columns);

if (field.getFieldable(flowerRowPosition, flowerColumnPosition) instanceof  Player){

    pollenGatherd=pollenGatherd+flowerAmountOfPollen;
    i--;

}
else if (field.getFieldable(flowerRowPosition, flowerColumnPosition) instanceof Empty){

    Flower flower = new Flower (flowerAmountOfPollen, flowerRowPosition, flowerColumnPosition);

    field.setFieldable(flowerRowPosition, flowerColumnPosition, flower);
flowerArrayList.add(flower);
i--;


}

}
    }

    private void posesEnemies() {

    }





}


