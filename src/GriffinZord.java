import java.util.Random;

/**
 *  Класс Griffin Thunderzord
 */
public class GriffinZord extends BaseZord
{
    /**
     * Статическое поле имени класса зорда
     */
    final static public String name = "Griffin Thunderzord";
    // Параметр нижнего порога вероятности удвоенной атаки
    final private byte chance;

    /**
     * Конструктор для Griffin Thunderzord
     */
    public GriffinZord()
    {
        this(100, 90, (byte) 30);
    }

    private GriffinZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    /**
     * Переопределённый метод атаки Griffin Thunderzord
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
