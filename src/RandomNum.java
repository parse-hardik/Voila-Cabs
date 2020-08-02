/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Hardik
 */
public class RandomNum 
{
    static int x;
    static double y;
    public static int getRandom()
    {
        y = Math.random();
        x = (int)(10000*y);
        //System.out.println("In RandomNum" + x);
        return x;
    }
}
