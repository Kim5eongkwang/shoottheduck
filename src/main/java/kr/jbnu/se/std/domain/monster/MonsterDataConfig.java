package kr.jbnu.se.std.domain.monster;

import static kr.jbnu.se.std.Framework.*;
import static kr.jbnu.se.std.domain.monster.Health.BOSS_CROW_LIFE;
import static kr.jbnu.se.std.domain.monster.Health.BOSS_DUCK_LIFE;
import static kr.jbnu.se.std.domain.monster.Health.BOSS_EAGLE_LIFE;
import static kr.jbnu.se.std.domain.monster.Health.BOSS_PUMPKIN_LIFE;
import static kr.jbnu.se.std.domain.monster.Health.BOSS_UFO_LIFE;
import static kr.jbnu.se.std.domain.monster.Health.ONE_LIFE;

import kr.jbnu.se.std.Framework;


public enum MonsterDataConfig {
    BAT(ONE_LIFE, (int) (frameHeight * 0.35), (int) (frameHeight * 0.20), frameWidth, 3, 3, 50, 5,"bat/"),

    DUCK(ONE_LIFE, (int) (frameHeight * 0.78), (int) (frameHeight * 0.60), frameWidth, 5, 2, 1, 1,"duck/"),

    HAWK(ONE_LIFE, (int)(Framework.frameHeight * 0.35), (int)(Framework.frameHeight * 0.20), frameWidth, 17, 14, 50, 3, "hawk/"),

    POTION_DUCK(ONE_LIFE, (int)(Framework.frameHeight * 0.78), (int)(Framework.frameHeight * 0.60), frameWidth, 17, 14, 50, 10, "potionduck/"),

    WITCH(ONE_LIFE, (int)(Framework.frameHeight * 0.5), (int)(Framework.frameHeight * 0.1), frameWidth, 20, 20, 20, 3, "witch/"),

    BOSS_DUCK(BOSS_DUCK_LIFE, (int)(Framework.frameHeight * 0.45), (int)(Framework.frameHeight * 0.3), frameWidth, 20, 20, 20, 9999, "boss/duck/"),

    BOSS_CROW(BOSS_CROW_LIFE,(int)(Framework.frameHeight * 0.45), (int)(Framework.frameHeight * 0.3), frameWidth, 8, 5, 500, 9999, "boss/crow/"),

    BOSS_EAGLE(BOSS_EAGLE_LIFE, (int)(Framework.frameHeight * 0.45), (int)(Framework.frameHeight * 0.3), frameWidth, 8, 5, 500, 9999, "boss/eagle/"),

    BOSS_PUMPKIN(BOSS_PUMPKIN_LIFE, (int)(Framework.frameHeight * 0.25), (int)(Framework.frameHeight * 0.1), frameWidth, 5, 2, 2500, 9999, "boss/pumpkin/"),

    BOSS_UFO(BOSS_UFO_LIFE, (int)(Framework.frameHeight * 0.25), (int)(Framework.frameHeight * 0.1), frameWidth, 17, 14, 500, 9999, "boss/ufo/");

    private final Health initialHeath;
    private final int maxHeightPosition;
    private final int minHeightPosition;
    private final int initialWidth;
    private final int maxSpeed;
    private final int minSpeed;
    private final int scoreValue;
    private final int respawnDelay;
    private final String imagePath;

    private static final String DEFAULT_IMAGE_FILE_PATH = "/images/monster/";



    MonsterDataConfig(Health initialHeath, int maxHeightPosition, int minHeightPosition, int initialWidth, int maxSpeed,
                      int minSpeed, int scoreValue, int respawnDelay, String imagePath) {
        this.initialHeath = initialHeath;
        this.maxHeightPosition = maxHeightPosition;
        this.minHeightPosition = minHeightPosition;
        this.initialWidth = initialWidth;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.scoreValue = scoreValue;
        this.respawnDelay = respawnDelay;
        this.imagePath = imagePath;
    }

    public Health getInitialHeath() {
        return this.initialHeath;
    }

    //TODO: 나머지 비지니스 로직 구현


}
