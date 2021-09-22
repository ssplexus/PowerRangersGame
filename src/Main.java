import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int exitCode = 1;

        do
        {
            Enemy enemy = new Enemy(1000);

            System.out.println("3, 2, 1 Fight!");
            BaseZord zords[] = new BaseZord[MegaZord.MAX];

            zords[0] = new LionZord();
            enemy.damaged(zords[0]);

            zords[1] = new FirebirdZord();
            enemy.damaged(zords[1]);

            zords[2] = new UnicornZord();
            enemy.damaged(zords[2]);

            zords[3] = new GriffinZord();
            enemy.damaged(zords[3]);

            zords[4] = new RedDragonZord();
            enemy.damaged(zords[4]);

            MegaZord megaZord = new MegaZord(zords);
            enemy.damaged(megaZord);

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
            exitCode = scanner.nextInt();
        }
        while (exitCode != 0);
    }
}
