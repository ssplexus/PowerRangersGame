import java.util.Random;

public class FirebirdZord extends BaseZord
{
    final static public String name = "Firebird Thunderzord";
    final private byte chance;

    public FirebirdZord()
    {
        this(100, 70, (byte) 20);
    }

    public FirebirdZord(int attack, int hp, byte chance)
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
