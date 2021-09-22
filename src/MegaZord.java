/**
 *  Класс Мегазорда
 */
public class MegaZord extends BaseZord
{
    /**
     *  Константанеобходимого количества зордов для составления мегазорда
     */
    final static public int MAX = 5;

    // Массив зордов
    private BaseZord zords[];

    /**
     * Конструктор Мегазорда
     * @param zords получает на вход массив зордов
     */
    public MegaZord(BaseZord[] zords)
    {
        super("Megazord");
        buildMegazord(zords);
    }

    /**
     * Метод сборки Мегазорда из зордов
     * @param zords получает на вход массив зордов
     * @return возвращает результат процесса сборки true/false
     */
    public boolean buildMegazord(BaseZord[] zords)
    {
        int zordsCount = 0;
        boolean isMegazord = false;
        hp = 0;

        // Подсчёт объектов зордов
        for (BaseZord zord: zords)
        {
            if(zord != null)
            {
                // Вычисление значения здоровья Мегазорда
                hp += zord.getHp();
                zordsCount++;
            }
        }
        // Проверка достаточности зордов для построения Мегазорда
        if(zordsCount < MAX || zordsCount > MAX)
            System.out.println("Not enough zords to build a megazord ");
        else
        {
            System.out.println("Megazord complete!");
            isMegazord = true;
            // Если зордов достаточно то сохранияем ссылку на массив зордов
            this.zords = zords;
        }

        return isMegazord;
    }

    /**
     * Переопределённый метод атаки Megazord
     * @return возвращает урон
     */
    @Override
    public int attack()
    {
        int sumDmg = 0;
        // Если Мегазорд не собран то атака невозможна
        if(zords == null)
            System.out.println("Attack failed! Megazord is not finished!");
        else
        {
            // Вычисление значения урона Мегазорда
            for (BaseZord zord: zords)
            {
                sumDmg += zord.attack();
            }
        }
        return  sumDmg;
    }
}
