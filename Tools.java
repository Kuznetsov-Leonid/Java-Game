package App.models;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 07.08.2021
 */

public class Tools {

    public static Random random = new Random();

    public static int randomRange(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
