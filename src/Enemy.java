public class Enemy
{
    private int hp;

    private boolean isDestroid;

    public Enemy(int hp)
    {
        this.hp = hp;
    }

    public void damaged(BaseZord zord)
    {
        int points = zord.attack();
        System.out.println(String.format("%s damaged the enemy by %d points", zord.getName(), points));
        hp -= points;
        System.out.println("Enemy hp = " + hp);

        if(hp <= 0)
        {
            System.out.println("Enemy destroid");
            isDestroid = true;
        }
    }

    public boolean isDestroid()
    {
        return isDestroid;
    }
}
