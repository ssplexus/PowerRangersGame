import java.util.Random;

public class GriffinZord extends BaseZord
{
    final static public String name = "Griffin Thunderzord";
    final private byte chance;

    public GriffinZord()
    {
        this(80, 90, (byte) 40);
    }

    public GriffinZord(int attack, int hp, byte chance)
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
