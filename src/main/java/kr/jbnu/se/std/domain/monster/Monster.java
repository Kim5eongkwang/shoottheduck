package kr.jbnu.se.std.domain.monster;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import kr.jbnu.se.std.domain.drawable.Drawable;

public abstract class Monster implements Drawable {

    private static Random random;
    private static long timeBetweenObjects;
    private int x;
    private int y;
    private static long lastObjectTime;
    private int speed;
    private int score;
    private BufferedImage objectImg;

    @Override
    public Graphics2D toGraphics2D() {
        return null;
    }
}
