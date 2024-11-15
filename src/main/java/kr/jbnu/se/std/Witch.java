package kr.jbnu.se.std;

import java.awt.image.BufferedImage;

/**
 * The duck class.
 * 
 * @author www.gametutorial.net
 */

public class Witch extends MovingObject {
    public static long lastObjectTime;
    /**
     * How much time must pass in order to create a new eagle?
     */
    public static long timeBetweenObjects = Framework.secInNanosec * 3;

    public static int nextObjectLines = 0;
    /**
     * kr.jbnu.se.std.Duck lines.
     * Where is starting location for the duck?
     * Speed of the duck?
     * How many points is a duck worth?
     */
    public static int[][] objectLines = {
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.1), -20, 200},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.3), -20, 200},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.4), -20, 200},
                                       {Framework.frameWidth, (int)(Framework.frameHeight * 0.5), -20, 200}
                                      };
    /**
     * Creates new duck.
     * @param objectImg Image of the duck.
     */
    public Witch(BufferedImage objectImg)
    {
        super(objectLines, nextObjectLines, objectImg);
    }
}
