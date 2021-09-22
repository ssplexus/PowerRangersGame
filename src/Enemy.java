/**
 *  Класс врага
 */
public class Enemy
{
    // Здоровье врага
    private int hp;

    // Признак уничтожения врага
    private boolean isDestroid;

    public Enemy(int hp)
    {
        this.hp = hp;
    }

    /**
     * Метод получения повреждений противником
     *
     * @param zord - на входе получает объект атакующегшо зорда
     */
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

    /**
     * Метод получения признака уничтожен ли враг
     *
     * @return возвроащает значенрие признака isDestroid
     */
    public boolean isDestroid()
    {
        return isDestroid;
    }
}
