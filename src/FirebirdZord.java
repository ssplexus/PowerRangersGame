import java.util.Random;

/**
 *  Класс Firebird Thunderzord
 */
public class FirebirdZord extends BaseZord
{
    /**
     * Статическое поле имени класса зорда
     */
    final static public String name = "Firebird Thunderzord";
    // Параметр нижнего порога вероятности удвоенной атаки
    final private byte chance;

    /**
     * Конструктор для Firebird Thunderzord
     */
    public FirebirdZord()
    {
        this(90, 70, (byte) 20);
    }

    private FirebirdZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    /**
     * Переопределённый метод атаки Firebird Thunderzord
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
