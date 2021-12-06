import jp.ac.uryukyu.ie.e215760.*;

public class Main2 {
    public static void main(String[] args){
        Hero hero = new Warrior("勇者", 10, 5); // (a)
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.name, enemy.name);

        int turn = 0;
        while( hero.dead == false && enemy.dead == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy); // (b)
            enemy.attack(hero);
            
        }
        System.out.println(hero);
        System.out.println("戦闘終了");
    }
}