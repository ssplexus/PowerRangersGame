import java.util.Random;

/**
 *  Класс Lion Thunderzord
 */
public class LionZord extends BaseZord
{
    /**
     * Статическое поле имени класса зорда
     */
    final static public String name = "Lion Thunderzord";
    // Параметр нижнего порога вероятности удвоенной атаки
    final private byte chance;

    /**
     * Конструктор для Lion Thunderzord
     */
    public LionZord()
    {
        this(90, 90, (byte) 50);
    }

    private LionZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    /**
     * Переопределённый метод атаки Lion Thunderzord
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
