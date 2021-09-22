import java.util.Random;

public class UnicornZord extends BaseZord
{
    final static public String name = "Unicorn Thunderzord";
    final private byte chance;

    public UnicornZord()
    {
        this(90, 110, (byte) 60);
    }

    public UnicornZord(int attack, int hp, byte chance)
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
