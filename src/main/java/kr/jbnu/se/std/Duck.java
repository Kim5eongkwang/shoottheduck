package kr.jbnu.se.std;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * The duck class.
 * 
 * @author www.gametutorial.net
 */

public class Duck extends MovingObject {
    
    /**
     * How much time must pass in order to create a new duck?
     */
    public static long timeBetweenObjects = Framework.secInNanosec / 2;
    /**
     * Last time when the duck was created.
     */
    public static long lastObjectTime = 0;
    
    /**
     * kr.jbnu.se.std.Duck lines.
     * Where is starting location for the duck?
     * Speed of the duck?
     * How many points is a duck worth?
     */
    public static int[][] objectLines = {
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.60), -2, 20},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.65), -3, 30},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.70), -4, 40},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.78), -5, 50}
                                      };
    /**
     * Indicate which is next duck line.
     */
    public static int nextObjectLines = 0;
    
    
    /**
     * X coordinate of the duck.
     */
    public int x;
    /**
     * Y coordinate of the duck.
     */
    public int y;
    
    /**
     * How fast the duck should move? And to which direction?
     */
    private int speed;
    
    /**
     * How many points this duck is worth?
     */
    public int score;
    
    /**
     * kr.jbnu.se.std.Duck image.
     */
    private BufferedImage objectImg;
    
    
    /**
     * Creates new duck.
     * 
     * @param x Starting x coordinate.
     * @param y Starting y coordinate.
     * @param speed The speed of this duck.
     * @param score How many points this duck is worth?
     * @param objectImg Image of the duck.
     */
    public Duck(int x, int y, int speed, int score, BufferedImage objectImg)
    {
        super(x, y, speed, score, objectImg);
    }
}
