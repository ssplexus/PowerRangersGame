import java.util.Random;

/**
 *  Класс Unicorn Thunderzord
 */
public class UnicornZord extends BaseZord
{
    /**
     * Статическое поле имени класса зорда
     */
    final static public String name = "Unicorn Thunderzord";
    // Параметр нижнего порога вероятности удвоенной атаки
    final private byte chance;

    /**
     * Конструктор для Unicorn Thunderzord
     */
    public UnicornZord()
    {
        this(110, 110, (byte) 60);
    }

    private UnicornZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    /**
     * Переопределённый метод атаки Unicorn Thunderzord
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
