package kr.jbnu.se.std;

public class Frog {
    private static Frog frog;
    private int xChange;
    private int yChange;
    public int x;
    public int y;

    private Frog() {};

    public static Frog getInstance() {
        if (frog == null) {
            frog = new Frog();
        }
        return frog;
    }

    public int getXChange() {
        return xChange;
    }
    public void setXChange(int x) {
        if (x > - 1250 && x <= 0) {
            this.xChange = x;
        }
    }

    public int getYChange() {
        return yChange;
    }
    public void setYChange(int y) {
        this.yChange = y;
    }
}
