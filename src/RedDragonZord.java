import java.util.Random;

/**
 *  Класс Red Dragon Thunderzord
 */
public class RedDragonZord extends BaseZord
{
    /**
     * Статическое поле имени класса зорда
     */
    final static public String name = "Red Dragon Thunderzord";
    // Параметр нижнего порога вероятности удвоенной атаки
    final private byte chance;

    /**
     * Конструктор для Red Dragon Thunderzord
     */
    public RedDragonZord()
    {
        this(140, 140, (byte) 60);
    }

    private RedDragonZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    /**
     * Переопределённый метод атаки Red Dragon Thunderzord
     * @return возвращает урон
     */
    @Override
    public int attack()
    {
        Random random = new Random();
        // Если вероятность выше значения chance, то удвоенная атака
        return random.nextInt() > chance ? super.attack(2)  : super.attack();
    }
}
