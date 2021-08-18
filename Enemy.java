package App.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 07.08.2021
 */

public class Enemy {

    private int powerPoint;
    private int healthPoint;
    private int enemyValueMin = 10;
    private int enemyValueMax = 30;

    public Enemy() {
        this.powerPoint = Tools.randomRange(enemyValueMin, enemyValueMax);
        this.healthPoint = Tools.randomRange(enemyValueMin, enemyValueMax);
    }

    public int getPowerPoint() {
        return powerPoint;
    }
}
