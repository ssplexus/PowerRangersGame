import java.util.Random;

public class BaseZord
{
    final private int attack;
    final private String name;
    protected int hp;

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

   public int attack(int x)
    {
        Random random = new Random();
        return x* attack * random.nextInt(101) / 100;
    }

    public int attack()
    {
        Random random = new Random();
        return attack * random.nextInt(101) / 100;
    }

    public String getName()
    {
        return name;
    }

}
