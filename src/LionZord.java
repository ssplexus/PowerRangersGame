import java.util.Random;

public class LionZord extends BaseZord
{
    final static public String name = "Lion Thunderzord";
    final private byte chance;

    public LionZord()
    {
        this(70, 90, (byte) 50);
    }

    public LionZord(int attack, int hp, byte chance)
    {
        super(name, attack, hp);
        this.chance = chance;
    }

    @Override
    public int attack()
    {
        Random random = new Random();
        return random.nextInt() > chance ? super.attack(2)  : super.attack();
    }
}
