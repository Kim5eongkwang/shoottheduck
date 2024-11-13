package kr.jbnu.se.std.domain.monster;

public class Health {
    private static final Health ZERO_LIFE = new Health(0);
    public static final Health ONE_LIFE = new Health(1);
    public static final Health BOSS_DUCK_LIFE = new Health(100);
    public static final Health BOSS_CROW_LIFE = new Health(30);
    public static final Health BOSS_EAGLE_LIFE = new Health(50);
    public static final Health BOSS_PUMPKIN_LIFE = new Health(300);
    public static final Health BOSS_UFO_LIFE = new Health(100);

    private final int value;

    public Health(int value) {
        this.value = value;
    }

    public Health takeDamage(Health damage) {
        if(value - damage.value < 0) {
            return ZERO_LIFE;
        }
        return new Health(value - damage.value);
    }
}
