import java.util.Scanner;

/**
 * Основной класс игры
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int exitCode = 1;

        // Цикл игры пока не введён код выхода
        do
        {
            // Создание объекта врага
            Enemy enemy = new Enemy(1000);

            System.out.println("3, 2, 1 Fight!");

            // Массив зордов
            BaseZord zords[] = new BaseZord[MegaZord.MAX];

            // Создание Lion Thunderzord и добавление в массив
            zords[0] = new LionZord();
            // Атака врага
            enemy.damaged(zords[0]);

            // Создание Lion Thunderzord и добавление в массив
            zords[1] = new FirebirdZord();
            // Атака врага
            enemy.damaged(zords[1]);

            // Создание Unicorn Thunderzord и добавление в массив
            zords[2] = new UnicornZord();
            // Атака врага
            enemy.damaged(zords[2]);

            // Создание Griffin Thunderzord и добавление в массив
            zords[3] = new GriffinZord();
            // Атака врага
            enemy.damaged(zords[3]);

            // Создание Red Dragon Thunderzord и добавление в массив
            zords[4] = new RedDragonZord();
            // Атака врага
            enemy.damaged(zords[4]);

            // Создание Megazord из массива зордов
            MegaZord megaZord = new MegaZord(zords);
            // Атака врага
            enemy.damaged(megaZord);

            // Результат игры
            if(enemy.isDestroid())
                System.out.println("You win!");
            else
                System.out.println("You lose!");

            // Проверка ввода целого число
            System.out.println("Enter 0 for exit game");
            while (!scanner.hasNextInt())
            {
                System.out.println("It's not an integer!");
                System.out.println("Enter 0 for exit game");
                scanner.next();
            }
            // Ввод кода выхода если не 0 то игра продолжается
            exitCode = scanner.nextInt();
        }
        while (exitCode != 0);
    }
}
