package jp.ac.uryukyu.ie.e215760;

/**
 * ヒーロークラス。
 *  String name; //heroの名前
 *  int hitPoint; //heroのHP
 *  int attack; //heroの攻撃力
 *  boolean dead; //heroの生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    ////////////////////////
    private String name;


    /**
     * heroの名前を得るメソッド
     * @return heroの名前
     */
    public String getHeroName(){
        return this.name;
    }

    /**
     * heroの名前を変更するメソッド
     * @param _name　変更するheroの名前
     */
    public void setHeroName(String _name){
        this.name = _name;
    }
    ////////////////////////
    private int hitPoint;

    /**
     * heroのHPの値を得るメソッド
     * @return　heroのHP
     */
    public int getHeroHP(){
        return this.hitPoint;
    }
    /**
     * heroのHPの値を変更するメソッド
     * @param _hitPoint　変更するHPの値
     */
    public void setHeroHp(int _hitPoint){
        this.hitPoint = _hitPoint;
    }
    ////////////////////////
    private int attack;

    /**
     * heroの攻撃力の値を得るメソッド
     * @return heroの攻撃力
     */
    public int getHeroAttack(){
        return this.attack;
    }
    /**
     * heroの攻撃力の値を変更するメソッド
     * @param _attack　変更するheroの攻撃力
     */
    public void setHeroAttack(int _attack){
        this.attack = _attack;
    }
    ////////////////////////
    private boolean dead;
    
    /**
     * heroの生死状態を確認するメソッド
     * @return　heroの生死状態
     */
    public boolean getHeroDead(){
        return this.dead;
    }
    /**
     * heroの生死状態を変更するメソッド
     * @param _dead 変更するheroの生死状態
     */
    public void setHeroDead(boolean _dead){
        this.dead = _dead;
    }
    /**
     * コンストラクタ。heroの名前、最大HP、攻撃力を指定する。
     * @param name heroの名
     * @param maximumHP heroのHP
     * @param attack heroの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        if (this.dead){
            System.out.println(name + "は攻撃できない...");
        }
        else{
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getEnemyName(), damage);
        e.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}