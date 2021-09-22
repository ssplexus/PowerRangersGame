import java.util.Random;

public class RedDragonZord extends BaseZord
{
    final static public String name = "Red Dragon Thunderzord";
    final private byte chance;

    public RedDragonZord()
    {
        this(100, 140, (byte) 60);
    }

    public RedDragonZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
        System.out.println(name + " entered the battle");
    }

    @Override
    public int attack()
    {
        Random random = new Random();
        return random.nextInt() > chance ? super.attack(2)  : super.attack();
    }
}
