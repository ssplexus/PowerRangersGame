import java.util.Random;

/**
 *  Базовый класс зорда
 */
public class BaseZord
{
    // Значение атаки зорда задаётся один раз в конструкторе
    final private int attack;
    // Имя зорда задаётся один раз в конструкторе
    final private String name;
    // Здоровье зорда
    protected int hp;

    // Конструктор для подкласса мегазорда, у него нет собственного значения атаки,
    // а здоровье вычисляется на основе суммирования здоровья входящих в него зордов
    public BaseZord(String name)
    {
        this(name, 0, 0);
    }

    public BaseZord(String name, int attack, int hp)
    {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }

    /**
     * Метод множественной атаки
     * @param x значение мультипликатора
     * @return звозвращает значение урона
     */
    public int attack(int x)
    {
        Random random = new Random();
        return x* attack * random.nextInt(101) / 100;
    }

    /**
     * Метод базовой атаки
     * @return возвращает значение урона
     */
    public int attack()
    {
        Random random = new Random();
        return attack * random.nextInt(101) / 100;
    }

    /**
     * Метод получения значения имени зорда
     * @return имя зорда
     */
    public String getName()
    {
        return name;
    }

    /**
     * Метод для получения значения здоровья зорда
     * @return значение здоровья (hp)
     */
    public int getHp()
    {
        return hp;
    }
}
