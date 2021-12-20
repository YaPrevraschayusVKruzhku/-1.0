import java.util.Scanner;

public class Main  {
    // количество по умолчанию:
    public static int rows=10;                   // ряды
    public static int columns=10;               //столбцы
    public static int quantityOfBeatles=10;    //жуки (враги)
    public static int amountOfPollen=10;      //пыльца
    public static int motions=40;            //ходы
    public static int amountOfFlowers=10;   //цветы


    public static void main (String[] args) {

        String command;
        do {

            System.out.println("Добро пожаловать игрок, заходи.");

            System.out.println("1. Начать");

            System.out.println("2. Настройки");

            System.out.println("3. О создателе ");

            System.out.println("4. Выйти");

            Scanner scanner = new Scanner(System.in);

             command = scanner.nextLine();

            switch (command) {

                case "1":
                    startNewGame();
                    break;

                case "2":
                    OptionsMenu.showOptionsMenu();
                    break;

                case "3":
                    showCredits();
                    break;

                case "4":
                    showRules();
                    break;

                case "5":
                    break;

                default:
                    System.out.println("НЕ ПОНЕЛ");
                    break;
            }
        }

        while (!command.equals("4"));

    }

    private static void showRules() {
        System.out.println("Тут скоро будут правила");
    }

    private static void showCredits() {
        System.out.println("Я - создатель сей игры - Андрэй");
    }

    private static void startNewGame() {

Game game = new Game (rows, columns, quantityOfBeatles, amountOfPollen, motions, amountOfPollen);

game.fillFieldWithEmptyObjects();


game.startGame();


    }
}
