import java.lang.Math;
import java.util.Random;

public class RandomNum_Driver 
{
    static int x;
    static int w;
    static double y;
    public static int getRandom()
    {
        y = Math.random();
        x = (int)(100*y);
        if(x>=0 && x<10)
            return x;
        else
            w= getRandom();
        return w;
    }
}
