public class MegaZord extends BaseZord
{
    final static public int MAX = 5;
    public int zordsCount;

    private BaseZord zords[];


    public MegaZord(BaseZord[] zords)
    {
        super("Megazord");
        buildMegazord(zords);
    }

    public boolean buildMegazord(BaseZord[] zords)
    {
        boolean isMegazord = false;

        for (BaseZord zord: zords)
        {
            if(zord != null)
            {
                zordsCount++;
            }
        }
        if(zordsCount < MAX || zordsCount > MAX)
            System.out.println("Not enough zords to build a megazord ");
        else
        {
            System.out.println("Megazord complete!");
            isMegazord = true;
            this.zords = zords;
        }

        return isMegazord;
    }

    @Override
    public int attack()
    {
        int sumDmg = 0;
        if(zords == null)
            System.out.println("Attack failed! Megazord is not finished!");
        else
        {
            for (BaseZord zord: zords)
            {
                sumDmg += zord.attack();
            }
        }

        return  sumDmg;
    }
}
