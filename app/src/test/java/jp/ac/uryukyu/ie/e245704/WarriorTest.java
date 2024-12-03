package jp.ac.uryukyu.ie.e245704;

import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @RepeatedTest(3)
    void attackWithWeponSkillTest() {
        int demoAttack = 5;
        int defaultSlimeHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", 10, demoAttack);
        Enemy slime = new Enemy("スライムもどき", defaultSlimeHp, 0);
        demoWarrior.attackWithWeponSkill(slime);
        int expectedDamage = (int)(demoAttack * 1.5);
        int restHitPoint = defaultSlimeHp - expectedDamage;
        assertEquals(restHitPoint, slime.getHitPoint());
    }
}
