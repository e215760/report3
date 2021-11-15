import jp.ac.uryukyu.ie.e215760.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 30);

        System.out.printf("%s vs. %s\n", hero.getHeroName(), enemy.getEnemyName());

        int turn = 0;
        while( hero.getHeroDead() == false && enemy.getEnemyDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}