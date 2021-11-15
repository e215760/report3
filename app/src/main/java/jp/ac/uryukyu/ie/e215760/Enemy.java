package jp.ac.uryukyu.ie.e215760;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    ////////////////////////
    private String name;

    /**
     * Enemyの名前を得るメソッド
     * @return　Enemyの名前
     */
    public String getEnemyName(){
        return this.name;
    }
    /**
     * Enemyの名前を変更るメソッド
     * @param _name　変更するEnemyの名前
     */
    public void setEnemyName(String _name){
        this.name = _name;
    }
    ////////////////////////
    private int hitPoint;

    /**
     * EnemyのHPの値を得るメソッド
     * @return　EnemyのHPの値
     */
    public int getEnemyHP(){
        return this.hitPoint;
    }

    /**
     * EnemyのHPを変更するメソッド
     * @param _hitPoint　変更するHPの値
     */
    public void setEnemyHp(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    ////////////////////////
    private int attack;

    /**
     * Enemyの攻撃力の値を得るメソッド
     * @return　Enemyの攻撃力の値
     */
    public int getEnemyAttack(){
        return this.attack;
    }
    /**
     * Enemyの攻撃力を変更するメソッド
     * @param _attack　変更する攻撃力の値
     */
    public void setEnemyAttack(int _attack){
        this.attack = _attack;
    }
    
    ////////////////////////
    private boolean dead;

    /**
     * Enemyの生死状態を確認するメソッド
     * @return　Enemyの生死状態
     */
    public boolean getEnemyDead(){
        return this.dead;
    }
    /**
     * Enemyの生死状態を変更するメソッド
     * @param _dead 変更するEnemyの状態
     */
    public void setEnemyDead(boolean _dead){
        this.dead = _dead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if (this.dead){
            System.out.println(name + "は攻撃できない...");
        }
        else{
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getHeroName(), damage);
            hero.wounded(damage);
        }
        
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}