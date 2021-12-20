import java.util.Scanner;

public class OptionsMenu {

   static int command;

  static  Scanner scanner = new Scanner(System.in);

    public static void showOptionsMenu() {

do    {
   System.out.println("""
           Выбери нужный тебе пункт:
           1. Показать текущие настройки
           2. Изменить текущие настройки
           3. Выход""");


          command = scanner.nextInt();
          switch (command)  {
              case 1:
                  System.out.println("\nТекущие настройки:\n" + "Ряды: " +
                          Main.rows + "\nСтолбики " + Main.columns + "\nЖуки: " +
                          Main.quantityOfBeatles + "\nПыльца: " + Main.amountOfPollen + "\nХоды: " + Main.motions + "\n Цветы: " + Main.amountOfPollen);
                  break;

              case 2:

                  System.out.println ("Выбери новое значение для количества рядов");

                  Main.rows = scanner.nextInt ();

                  System.out.println ("Выбери новое значение для количества столбиков");

                  Main.columns = scanner.nextInt ();

                  System.out.println ("Выбери новое значение для количества врагов");

                  Main.quantityOfBeatles = scanner.nextInt ();

                  System.out.println ("Выбери новое значение для количества пыльцы");

                  Main.amountOfPollen = scanner.nextInt ();

                  System.out.println ("Выбери новое значение для количества ходов");

                  Main.motions = scanner.nextInt ();

                  System.out.println ("Выбери новое значение для количества цветов");

                  Main.amountOfPollen=scanner.nextInt();

                  break;

              case 3:
                  break;

              default:
                  System.out.println("НЕ ПОНЕЛ");

                  break;
          }
}
while (command !=3);

    }
}
