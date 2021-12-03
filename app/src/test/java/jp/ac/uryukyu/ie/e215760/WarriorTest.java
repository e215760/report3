package jp.ac.uryukyu.ie.e215760;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    
    @Test
    void warriorAttackTest(){
        int expectedEnemyHitPoint = 50;
        int i = 0;
        while (i <= 2){
            Warrior demoHero = new Warrior("デモ勇者", 100, 100);
            Enemy demoEnemy = new Enemy("スライム", 200, 0);
            demoHero.attackWithWeponSkill(demoEnemy);
            assertEquals(expectedEnemyHitPoint, demoEnemy.hitPoint);
            i++;
        }
    }
}
